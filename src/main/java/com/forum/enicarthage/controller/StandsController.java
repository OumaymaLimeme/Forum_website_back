package com.forum.enicarthage.controller;

import com.forum.enicarthage.model.Entreprise;
import com.forum.enicarthage.model.Stands;
import com.forum.enicarthage.services.StandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class StandsController {
    @Autowired
    private StandsService standsService;
    @PostMapping("/add-stands")
    public Stands createstands(@RequestBody Stands stands){
        Stands s=standsService.createStands(stands);
        return s;
    }
    @GetMapping("stands")
    public List<Stands> getStands(){
        return  standsService.getStands();
    }

    @PutMapping("/update-stands/{id}")
    public Stands updateStandsById(@PathVariable("id") long id, @RequestBody Stands stands)
    {
        return  standsService.updateStands(id,stands);
    }
    //delete Stands bu id
    @DeleteMapping("/delete-stands/{id}")
    public  String deleteStands(@PathVariable("id") long id)
    {
        standsService.deleteStands(id);
        return "Stands deleted Succesfull";
    }
    // Get Stands By id
    @GetMapping("/stand/{id}")
    public  Stands getStandsById(@PathVariable("id") long id){

        return  standsService.getStandsById(id);
    }

}

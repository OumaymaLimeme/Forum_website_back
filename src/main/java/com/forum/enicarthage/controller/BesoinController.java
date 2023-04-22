package com.forum.enicarthage.controller;
import com.forum.enicarthage.model.Besoin;
import com.forum.enicarthage.services.BesoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class BesoinController {
    @Autowired
    private BesoinService besoinService;

    @PostMapping("/add-besoin")
    public Besoin createBesoin(@RequestBody Besoin bes){
        Besoin e=besoinService.createBesoin(bes);
        return e;
    }
    //Read Besoin
    @GetMapping("/besoins")
    public List<Besoin> getBesoins(){
        return besoinService.getBesoins();
    }
    // Update Besoins
    @PutMapping("/update-besoin/{id}")
    public Besoin updateBesoinById(@PathVariable("id") long id,@RequestBody Besoin besoin)
    {
        return  besoinService.updateBesoin(id,besoin);
    }
    //delete Besoin bu id
    @DeleteMapping("/delete-besoin/{id}")
    public  String deleteBesoin(@PathVariable("id") long id)
    {
        besoinService.deleteBesoin(id);
        return "Besoin deleted Succesfull";
    }
    // Get Besoin By id
    @GetMapping("/besoin/{id}")
    public  Besoin getBesoinById(@PathVariable("id") long id){

        return  besoinService.getBesoinById(id);
    }


}

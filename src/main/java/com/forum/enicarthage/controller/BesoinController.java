package com.forum.enicarthage.controller;
import com.forum.enicarthage.model.Besoin;
import com.forum.enicarthage.services.BesoinService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class BesoinController {
    private static final Logger logger = LogManager.getLogger(BesoinController.class);
    @Autowired
    private BesoinService besoinService;

    @PostMapping("/add-besoin")
    public Besoin createBesoin(@RequestBody Besoin bes){
        logger.info("Creating new besoin: {}", bes);
        Besoin e = besoinService.createBesoin(bes);
        logger.info("Created new besoin: {}", e);
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
        logger.info("Updating besoin with id {} ", id);
        return  besoinService.updateBesoin(id,besoin);

    }
    //delete Besoin bu id
    @DeleteMapping("/delete-besoin/{id}")
    public  String deleteBesoin(@PathVariable("id") long id)
    {
        logger.info("Deleting besoin with id {}", id);
        besoinService.deleteBesoin(id);
        logger.info("Deleted besoin with id {}", id);
        return "Besoin deleted Successfully";
    }
    // Get Besoin By id
    @GetMapping("/besoin/{id}")
    public  Besoin getBesoinById(@PathVariable("id") long id){
        logger.info("Getting besoin with id {}", id);
        Besoin besoin = besoinService.getBesoinById(id);
        logger.info("Retrieved besoin with id {}: {}", id, besoin);
        return besoin;
    }


}

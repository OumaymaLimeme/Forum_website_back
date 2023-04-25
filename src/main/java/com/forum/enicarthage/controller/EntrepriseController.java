package com.forum.enicarthage.controller;

import com.forum.enicarthage.model.Entreprise;
import com.forum.enicarthage.services.EntrepService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EntrepriseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EntrepriseController.class);
    @Autowired
    private EntrepService entrepService;
    // Rest API Crud - Create Entreprise - POst
    //Read Entreprise -GET
    //Delete Entreprise - DELETE
    // Update Entreprise -PUT
    // create Entreprise
   @PostMapping("/add")
    public Entreprise createEntreprise(@RequestBody Entreprise ent){
       LOGGER.info("Creating entreprise with name: {}", ent.getNom());
       Entreprise e = entrepService.createEntreprise(ent);
       LOGGER.info("Created entreprise ");
        return e;
    }
    //Read Entreprise
    @GetMapping("/entreprises")
    public List<Entreprise> getEntreprises(){
        LOGGER.info("Fetching all entreprises");
       return entrepService.getEntreprises();
    }
    // Update Entreprises
    @PutMapping("/update/{id}")
    public Entreprise updateEntrepriseById(@PathVariable("id") long id,@RequestBody Entreprise entreprise)
    {    LOGGER.info("Updating entreprise with id: {}", id);
        return  entrepService.updateEntreprise(id,entreprise);
    }
     //delete Entreprise bu id
    @DeleteMapping("/delete/{id}")
    public  String deleteEntreprise(@PathVariable("id") long id)
    {
        LOGGER.info("Deleting entreprise with id: {}", id);
        entrepService.deleteEntreprise(id);
        LOGGER.info("Deleted entreprise with id: {}", id);
        return "Entreprise deleted successfully";
    }
    // Get Entreprise By id
    @GetMapping("/entreprise/{id}")
    public  Entreprise getEntrepriseById(@PathVariable("id") long id){
        LOGGER.info("Fetching entreprise with id: {}", id);
        return  entrepService.getEntrepriseById(id);
    }

}

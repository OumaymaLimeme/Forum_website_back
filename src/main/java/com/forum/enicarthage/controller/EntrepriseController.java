package com.forum.enicarthage.controller;

import com.forum.enicarthage.model.Entreprise;
import com.forum.enicarthage.services.EntrepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EntrepriseController {
    @Autowired
    private EntrepService entrepService;
    // Rest API Crud - Create Entreprise - POst
    //Read Entreprise -GET
    //Delete Entreprise - DELETE
    // Update Entreprise -PUT
    // create Entreprise
   @PostMapping("/add")
    public Entreprise createEntreprise(@RequestBody Entreprise ent){
        Entreprise e=entrepService.createEntreprise(ent);
        return e;
    }
    //Read Entreprise
    @GetMapping("/entreprises")
    public List<Entreprise> getEntreprises(){
        return entrepService.getEntreprises();
    }
    // Update Entreprises
    @PutMapping("/update/{id}")
    public Entreprise updateEntrepriseById(@PathVariable("id") long id,@RequestBody Entreprise entreprise)
    {
        return  entrepService.updateEntreprise(id,entreprise);
    }
     //delete Entreprise bu id
    @DeleteMapping("/delete/{id}")
    public  String deleteEntreprise(@PathVariable("id") long id)
    {
        entrepService.deleteEntreprise(id);
        return "Entreprise deleted Succesfull";
    }
    // Get Entreprise By id
    @GetMapping("/entreprise/{id}")
    public  Entreprise getEntrepriseById(@PathVariable("id") long id){

        return  entrepService.getEntrepriseById(id);
    }

}

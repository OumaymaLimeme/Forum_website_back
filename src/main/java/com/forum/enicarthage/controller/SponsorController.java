package com.forum.enicarthage.controller;

import com.forum.enicarthage.model.Sponsor;
import com.forum.enicarthage.services.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class SponsorController {
    @Autowired
    private SponsorService sponsorService;
    // Rest API Crud - Create Sponsor - POst
    //Read Sponsor -GET
    //Delete Sponsor - DELETE
    // Update Sponsor -PUT
    // create Sponsor
    @PostMapping("/add-sponsor")
    public Sponsor createSponsor(@RequestBody Sponsor ent){
        Sponsor e=sponsorService.createSponsor(ent);
        return e;
    }
    //Read sponsors
    @GetMapping("/sponsors")
    public List<Sponsor> getSponsors(){
        return sponsorService.getSponsors();
    }
    // Update sponsor
    @PutMapping("/update-sponsor/{id}")
    public Sponsor updateSponsorById(@PathVariable("id") long id,@RequestBody Sponsor entreprise)
    {
        return  sponsorService.updateSponsor(id,entreprise);
    }
    //delete Entreprise bu id
    @DeleteMapping("/delete-sponsor/{id}")
    public  String deleteSponsor(@PathVariable("id") long id)
    {
        sponsorService.deleteSponsor(id);
        return "Sponsors deleted Succesfull";
    }
    // Get Entreprise By id
    @GetMapping("/sponsor/{id}")
    public  Sponsor getEntrepriseById(@PathVariable("id") long id){

        return  sponsorService.getSponsorById(id);
    }
}

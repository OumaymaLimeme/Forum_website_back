package com.forum.enicarthage.services;

import com.forum.enicarthage.model.Sponsor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SponsorService {
    //create
    public Sponsor createSponsor(Sponsor sponsor);
    //read Sponsors
    public List<Sponsor> getSponsors();
    //read Sponsor by id
    public Sponsor getSponsorById(long id);
    //delete Sponsor by id
    public  void deleteSponsor(long id);
    //update Sponsor by id
    public  Sponsor updateSponsor(long id,Sponsor sponsor);
}

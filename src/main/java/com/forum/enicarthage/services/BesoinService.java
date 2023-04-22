package com.forum.enicarthage.services;

import com.forum.enicarthage.model.Besoin;
import com.forum.enicarthage.model.Entreprise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BesoinService {
    //create
    public Besoin createBesoin(Besoin besoin);
    //read Besoins
    public List<Besoin> getBesoins();
    //read Besoin by id
    public Besoin getBesoinById(long id);
    //delete Besoin by id
    public  void deleteBesoin(long id);
    //update Besoin by id
    public  Besoin updateBesoin(long id,Besoin besoin);
}

package com.forum.enicarthage.services;

import com.forum.enicarthage.model.Entreprise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntrepService {
    //create
    public Entreprise createEntreprise(Entreprise entrep);
    //read entrprises
    public List<Entreprise> getEntreprises();
    //read entreprise by id
    public Entreprise getEntrepriseById(long id);
    //delete entrprise by id
     public  void deleteEntreprise(long id);
    //update entrprise by id
    public  Entreprise updateEntreprise(long id,Entreprise entrep);
}

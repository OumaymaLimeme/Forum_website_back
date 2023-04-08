package com.forum.enicarthage.serviceImpl;

import com.forum.enicarthage.Repository.EntrepRepository;
import com.forum.enicarthage.model.Entreprise;
import com.forum.enicarthage.services.EntrepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepServiceImpl implements EntrepService {


    @Autowired
    private EntrepRepository entrepRepository;
    @Override
    public Entreprise createEntreprise(Entreprise entrep) {
        return entrepRepository.save(entrep);
    }

    @Override
    public List<Entreprise> getEntreprises() {

        return (List<Entreprise>) entrepRepository.findAll() ;
    }

    @Override
    public Entreprise getEntrepriseById(long id) {

        return entrepRepository.findById(Math.toIntExact(id)).get();
    }

    @Override
    public void deleteEntreprise(long id) {
        entrepRepository.deleteById((int) id);
    }

    @Override
    public Entreprise updateEntreprise(long id,Entreprise entrep ) {
        Entreprise ent1=entrepRepository.findById((int) id).get();
        ent1.setNom(entrep.getNom());
        ent1.setEmail(entrep.getEmail());
        ent1.setAdresse(entrep.getAdresse());
        ent1.setTelephone(entrep.getTelephone());
        ent1.setBudget(entrep.getBudget());
        ent1.setSpecialite(entrep.getSpecialite());
        return entrepRepository.save(ent1);
    }
}

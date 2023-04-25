package com.forum.enicarthage.serviceImpl;

import com.forum.enicarthage.Repository.EntrepRepository;
import com.forum.enicarthage.model.Entreprise;
import com.forum.enicarthage.services.EntrepService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepServiceImpl implements EntrepService {
    private static final Logger logger = LogManager.getLogger(EntrepServiceImpl.class);

    @Autowired
    private EntrepRepository entrepRepository;
    @Override
    public Entreprise createEntreprise(Entreprise entrep) {
        logger.info("Création d'une entreprise : {}", entrep.getNom());
        return entrepRepository.save(entrep);
    }

    @Override
    public List<Entreprise> getEntreprises() {
        logger.info("Retrieving all entreprises");

        return (List<Entreprise>) entrepRepository.findAll() ;
    }

    @Override
    public Entreprise getEntrepriseById(long id) {
        logger.info("Retrieving entreprise with id {}", id);
        return entrepRepository.findById(Math.toIntExact(id)).get();
    }

    @Override
    public void deleteEntreprise(long id) {
        logger.info("Supprimer une entreprise  d id: {}",id);
        entrepRepository.deleteById((int) id);
    }

    @Override
    public Entreprise updateEntreprise(long id,Entreprise entrep ) {
        logger.info("Modifier une entreprise : {}", entrep.getNom());
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

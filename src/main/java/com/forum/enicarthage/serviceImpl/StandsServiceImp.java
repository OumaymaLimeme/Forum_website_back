package com.forum.enicarthage.serviceImpl;

import com.forum.enicarthage.Repository.StandsRepository;
import com.forum.enicarthage.model.Stands;
import com.forum.enicarthage.services.StandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandsServiceImp implements StandsService {
    @Autowired
    private StandsRepository standsRepository;
    @Override
    public Stands createStands(Stands stands) {
        return standsRepository.save(stands);
    }

    @Override
    public List<Stands> getStands() {
        return (List<Stands>)standsRepository.findAll();
    }

    @Override
    public Stands getStandsById(long id) {
        return standsRepository.findById((int) id).get();
    }

    @Override
    public void deleteStands(long id) {
             standsRepository.deleteById((int) id);
    }

    @Override
    public Stands updateStands(long id, Stands stands) {
        Stands s=standsRepository.findById((int) id).get();
        s.setEmplacement(stands.getEmplacement());
        s.setEmail(stands.getEmail());
        s.setTelephone(stands.getTelephone());
        s.setNom_proprietaire(stands.getNom_proprietaire());
        s.setNom_entreprise(stands.getNom_entreprise());
        s.setType_pack(stands.getType_pack());
        return  standsRepository.save(s);
    }


}

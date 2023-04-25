package com.forum.enicarthage.serviceImpl;

import com.forum.enicarthage.Repository.SponsorRepository;
import com.forum.enicarthage.model.Sponsor;
import com.forum.enicarthage.services.SponsorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SponsorServiceImpl implements SponsorService {
    private static final Logger logger = LogManager.getLogger(EntrepServiceImpl.class);
    @Autowired
    private SponsorRepository sponsorRepository;
    @Override
    public Sponsor createSponsor(Sponsor sponsor) {
        return  sponsorRepository.save(sponsor);
    }

    @Override
    public List<Sponsor> getSponsors() {
        logger.info("Retrieving all sponsors");
        return (List<Sponsor>)sponsorRepository.findAll();
    }

    @Override
    public Sponsor getSponsorById(long id) {
        logger.info("Retrieving Sponsor with id {}", id);
        return sponsorRepository.findById((int) id).get();
    }

    @Override
    public void deleteSponsor(long id) {
        sponsorRepository.deleteById((int) id);
    }

    @Override
    public Sponsor updateSponsor(long id, Sponsor sponsor) {
        Sponsor s=sponsorRepository.findById((int) id).get();
        s.setEmail(sponsor.getEmail());
        s.setBudget(sponsor.getBudget());
        s.setNom(sponsor.getNom());
        s.setAdresse(sponsor.getAdresse());
        s.setSpecialite(sponsor.getSpecialite());
        s.setNom(sponsor.getNom());
        s.setType_package(sponsor.getType_package());
        return sponsorRepository.save(s);
    }
}

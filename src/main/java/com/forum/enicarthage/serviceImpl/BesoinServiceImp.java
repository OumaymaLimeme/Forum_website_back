package com.forum.enicarthage.serviceImpl;

import com.forum.enicarthage.Repository.BesoinReposirory;
import com.forum.enicarthage.model.Besoin;
import com.forum.enicarthage.services.BesoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BesoinServiceImp implements BesoinService {
    @Autowired
    private BesoinReposirory besoinReposirory;
    @Override
    public Besoin createBesoin(Besoin besoin) {
        return besoinReposirory.save(besoin);
    }
    @Override
    public List<Besoin> getBesoins() {
        return (List<Besoin>)besoinReposirory.findAll();
    }

    @Override
    public Besoin getBesoinById(long id) {
        return besoinReposirory.findById((int) id).get();
    }

    @Override
    public void deleteBesoin(long id) {
              besoinReposirory.deleteById((int) id);
    }

    @Override
    public Besoin updateBesoin(long id, Besoin besoin) {
        Besoin b=besoinReposirory.findById((int) id).get();
        b.setQuantite(besoin.getQuantite());
        b.setBesoin_log(besoin.getBesoin_log());
        b.setBesoin_tech(besoin.getBesoin_tech());
        b.setFacture(besoin.getFacture());
        b.setPrix(besoin.getPrix());
        b.setTotal(besoin.getTotal());
        return  besoinReposirory.save(b);

    }
}

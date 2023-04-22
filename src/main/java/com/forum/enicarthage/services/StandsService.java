package com.forum.enicarthage.services;

import com.forum.enicarthage.model.Stands;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StandsService {
    //create Stands
    public Stands createStands(Stands entrep);
    //read Stands
    public List<Stands> getStands();
    //read Stands by id
    public Stands getStandsById(long id);
    //delete Stands by id
    public  void deleteStands(long id);
    //update Stands by id
    public  Stands updateStands(long id,Stands entrep);
}

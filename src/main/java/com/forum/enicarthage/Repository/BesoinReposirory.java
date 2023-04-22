package com.forum.enicarthage.Repository;

import com.forum.enicarthage.model.Besoin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BesoinReposirory extends CrudRepository<Besoin,Integer> {
}

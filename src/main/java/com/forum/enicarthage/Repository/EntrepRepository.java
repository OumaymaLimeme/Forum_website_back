package com.forum.enicarthage.Repository;

import com.forum.enicarthage.model.Entreprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepRepository extends CrudRepository<Entreprise,Integer> {
}

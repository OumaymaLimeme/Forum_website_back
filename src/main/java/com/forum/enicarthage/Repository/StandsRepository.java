package com.forum.enicarthage.Repository;

import com.forum.enicarthage.model.Stands;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandsRepository extends CrudRepository<Stands, Integer> {
}

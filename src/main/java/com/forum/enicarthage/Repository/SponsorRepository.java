package com.forum.enicarthage.Repository;

import com.forum.enicarthage.model.Sponsor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends CrudRepository<Sponsor,Integer> {
}

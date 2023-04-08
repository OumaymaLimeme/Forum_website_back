package com.forum.enicarthage.Repository;

import com.forum.enicarthage.model.Invite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteRepository extends CrudRepository<Invite,Integer > {
}

package com.forum.enicarthage.services;
import com.forum.enicarthage.model.Invite;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InviteService {
    //create
    public Invite createInvite(Invite invite);
    //read entrprises
    public List<Invite> getInvites();
    //read Invite by id
    public Invite getInviteById(long id);
    //delete Invite by id
    public  void deleteInvite(long id);
    //update Invite by id
    public  Invite updateInvite(long id,Invite entrep);
}

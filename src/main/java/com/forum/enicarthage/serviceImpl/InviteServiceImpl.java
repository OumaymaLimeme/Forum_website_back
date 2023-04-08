package com.forum.enicarthage.serviceImpl;

import com.forum.enicarthage.Repository.InviteRepository;
import com.forum.enicarthage.model.Invite;
import com.forum.enicarthage.services.InviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InviteServiceImpl implements InviteService {
    @Autowired
    private InviteRepository inviteRepository;
    @Override
    public Invite createInvite(Invite invite) {
        return inviteRepository.save(invite);
    }

    @Override
    public List<Invite> getInvites() {
        return (List<Invite>)inviteRepository.findAll();
    }

    @Override
    public Invite getInviteById(long id) {
        return inviteRepository.findById((int) id).get();
    }
    @Override
    public void deleteInvite(long id) {
        inviteRepository.deleteById((int) id);
    }
    @Override
    public Invite updateInvite(long id, Invite invite) {
        Invite inv=inviteRepository.findById((int) id).get();
        inv.setEmail(invite.getEmail());
        inv.setNom(invite.getNom());
        inv.setPrenom(invite.getPrenom());
        inv.setTelephone(invite.getTelephone());
        return inviteRepository.save(inv);
    }
}

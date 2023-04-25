package com.forum.enicarthage.serviceImpl;

import com.forum.enicarthage.Repository.InviteRepository;
import com.forum.enicarthage.model.Invite;
import com.forum.enicarthage.services.InviteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InviteServiceImpl implements InviteService {
    private static final Logger logger = LogManager.getLogger(InviteServiceImpl .class);
    @Autowired
    private InviteRepository inviteRepository;
    @Override
    public Invite createInvite(Invite invite) {
        logger.info("Création d'un nouvel invité : {}", invite.getNom());
        return inviteRepository.save(invite);
    }

    @Override
    public List<Invite> getInvites() {
        logger.info("Retrieving all invités");
        return (List<Invite>)inviteRepository.findAll();
    }

    @Override
    public Invite getInviteById(long id) {
        return inviteRepository.findById((int) id).get();
    }
    @Override
    public void deleteInvite(long id) {
        logger.info("Suppression d'un  invité avec un id : {}", id);
        inviteRepository.deleteById((int) id);
    }
    @Override
    public Invite updateInvite(long id, Invite invite) {
        logger.info("Modification d'un  invité : {}", invite.getNom());
        Invite inv=inviteRepository.findById((int) id).get();
        inv.setEmail(invite.getEmail());
        inv.setNom(invite.getNom());
        inv.setPrenom(invite.getPrenom());
        inv.setTelephone(invite.getTelephone());
        return inviteRepository.save(inv);
    }
}

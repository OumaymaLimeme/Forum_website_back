package com.forum.enicarthage.controller;
import com.forum.enicarthage.model.Invite;
import com.forum.enicarthage.services.InviteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class InviteController {
    private static final Logger logger = LoggerFactory.getLogger(InviteController.class);
    @Autowired
    private InviteService inviteService;
    // Rest API Crud - Create Invite - POst
    //Read Invite -GET
    //Delete Invite - DELETE
    // Update Invite -PUT
    // create Invite
    @PostMapping("/add-invite")
    public Invite createInvite(@RequestBody Invite ent) {
        logger.info("Creating invite: {}", ent);
        Invite e = inviteService.createInvite(ent);
        logger.info("Created invite: {}", e);
        return e;
    }
    //Read Invite
    @GetMapping("/invites")
    public List<Invite> getInvites(){
        logger.info("Getting all invites");
        return  inviteService.getInvites();
    }
    // Update Invite
    @PutMapping("/update-invite/{id}")
    public Invite updateInviteById(@PathVariable("id") long id, @RequestBody Invite invite)
    {   logger.info("Updating invite with id {} to {}", id, invite);
        return  inviteService.updateInvite(id,invite);
    }
    //delete Entreprise bu id
    @DeleteMapping("/delete-invite/{id}")
    public  String deleteInvite(@PathVariable("id") long id)
    {
        logger.info("Deleting invite with id {}", id);
        inviteService.deleteInvite(id);
        logger.info("Deleted invite with id {}", id);
        return "Invite deleted successfully";
    }
    // Get Entreprise By id
    @GetMapping("/invite/{id}")
    public  Invite getInviteById(@PathVariable("id") long id){

        logger.info("Getting invite with id {}", id);
        Invite invite = inviteService.getInviteById(id);
        logger.info("Got invite with id {}: {}", id, invite);
        return invite;
    }



}

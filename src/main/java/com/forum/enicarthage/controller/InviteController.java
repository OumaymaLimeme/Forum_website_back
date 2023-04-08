package com.forum.enicarthage.controller;
import com.forum.enicarthage.model.Invite;
import com.forum.enicarthage.services.InviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class InviteController {
    @Autowired
    private InviteService inviteService;
    // Rest API Crud - Create Invite - POst
    //Read Invite -GET
    //Delete Invite - DELETE
    // Update Invite -PUT
    // create Invite
    @PostMapping("/add-invite")
    public Invite createInvite(@RequestBody Invite ent) {
        Invite e = inviteService.createInvite(ent);
        return e;
    }
    //Read Invite
    @GetMapping("/invites")
    public List<Invite> getInvites(){
        return  inviteService.getInvites();
    }
    // Update Invite
    @PutMapping("/update-invite/{id}")
    public Invite updateInviteById(@PathVariable("id") long id, @RequestBody Invite invite)
    {
        return  inviteService.updateInvite(id,invite);
    }
    //delete Entreprise bu id
    @DeleteMapping("/delete-invite/{id}")
    public  String deleteInvite(@PathVariable("id") long id)
    {
        inviteService.deleteInvite(id);
        return "Invite deleted Succesfull";
    }
    // Get Entreprise By id
    @GetMapping("/invite/{id}")
    public  Invite getInviteById(@PathVariable("id") long id){

        return  inviteService.getInviteById(id);
    }



}

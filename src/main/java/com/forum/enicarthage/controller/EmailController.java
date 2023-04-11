package com.forum.enicarthage.controller;
// Importing required classes
import com.forum.enicarthage.model.Email;
import com.forum.enicarthage.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/sendMail")
    private String
    sendMail(@RequestBody Email email){
        String status;
        status=emailService.sendemail(email);
        return  status;
    }


}
package com.forum.enicarthage.services;

import com.forum.enicarthage.model.Email;
import org.springframework.stereotype.Service;
@Service
public interface EmailService {
    String sendemail(Email email);
}

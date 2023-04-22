package com.forum.enicarthage.services;

import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    public int loginValidation(String password,String usermail) ;
}

package com.forum.enicarthage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private  String recipient;
    private  String body;
    private  String  subject;
}

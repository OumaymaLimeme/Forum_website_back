package com.forum.enicarthage.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="invite_Table")

public class Invite {
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invite_id")
    private  long invite_id;

    @Column(name="prenom")
    private  String prenom;

    public Invite(long invite_id, String prenom, String sex, String nom, String email, String telephone) {
        this.invite_id = invite_id;
        this.prenom = prenom;
        this.sex = sex;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
    }

    @Column(name="sex")
    private String sex;




    public long getInvite_id() {
        return invite_id;
    }

    public Invite() {
        super();
    }

    public void setInvite_id(long invite_id) {
        this.invite_id = invite_id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name="nom")
    private  String nom;

    @Column(name="email")
    private  String email;


    @Column(name="telephone")
    private  String telephone;




}

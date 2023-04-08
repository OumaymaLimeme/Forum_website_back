package com.forum.enicarthage.model;

import jakarta.persistence.*;

@Entity
@Table(name="Sponsor_Table")
public class Sponsor {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  long sponsor_id;

     @Column(name = "nom")
      private  String nom;

     @Column(name="Spécialité")
     private String specialite;

    public long getSponsor_id() {
        return sponsor_id;
    }

    public Sponsor() {
     super();
    }

    public Sponsor(long sponsor_id, String nom, String specialite, String email, String adresse, String telephone, double budget, String type_package) {
        this.sponsor_id = sponsor_id;
        this.nom = nom;
        this.specialite = specialite;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.budget = budget;
        this.type_package = type_package;
    }

    public void setSponsor_id(long sponsor_id) {
        this.sponsor_id = sponsor_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getType_package() {
        return type_package;
    }

    public void setType_package(String type_package) {
        this.type_package = type_package;
    }

    @Column(name = "email")
    private  String email;

     @Column(name = "adress")
      private String adresse;

     @Column(name="telephone")
    private  String telephone;

     @Column(name = "budget")
    private  double budget;

     @Column(name = "type_package")
     private  String type_package;

}

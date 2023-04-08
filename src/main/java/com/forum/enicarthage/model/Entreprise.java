package com.forum.enicarthage.model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name="Entreprise_Table")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entrep_id")
    private  long entrep_id;

    @Column(name="nom_entr")
    private  String nom;

    @Column(name="spec_entr")
    private  String specialite;

    @Column(name="email_entr")
    private  String email;

    public Entreprise() {
       super();
    }

    public Entreprise(Long entrep_id, String nom, String specialite, String email, String localisation, String adresse, String telephone, double budget) {
        this.entrep_id = entrep_id;
        this.nom = nom;
        this.specialite = specialite;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.budget = budget;
    }

    public long getEntrep_id() {
        return entrep_id;
    }

    public void setEntrep_id(long entrep_id) {
        this.entrep_id = entrep_id;
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

    @Column(name="adresse_entr")
    private  String adresse;
    @Column(name="tel_entr")
    private  String telephone;
    @Column(name="bud_entr")
    private  double budget;


}

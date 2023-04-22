package com.forum.enicarthage.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name ="Stands_Table" )
public class Stands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_stands")
    private  long id_stands;

    @Column(name="nom_entreprise")
    private String nom_entreprise;

    @Column(name="nom_proprietaire")
    private  String nom_proprietaire;

    @Column(name = "email")
    private  String email;

    public Stands() {
        super();
    }
    @Column(name="telephone")
    private  String telephone;

    public Stands(long id_stands, String nom_entreprise, String nom_proprietaire, String email, String telephone, String emplacement, String type_pack) {
        this.id_stands = id_stands;
        this.nom_entreprise = nom_entreprise;
        this.nom_proprietaire = nom_proprietaire;
        this.email = email;
        this.telephone = telephone;
        this.emplacement = emplacement;
        this.type_pack = type_pack;
    }

    public long getId_stands() {
        return id_stands;
    }

    public void setId_stands(long id_stands) {
        this.id_stands = id_stands;
    }

    public String getNom_entreprise() {
        return nom_entreprise;
    }

    public void setNom_entreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }

    public String getNom_proprietaire() {
        return nom_proprietaire;
    }

    public void setNom_proprietaire(String nom_proprietaire) {
        this.nom_proprietaire = nom_proprietaire;
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

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getType_pack() {
        return type_pack;
    }

    public void setType_pack(String type_pack) {
        this.type_pack = type_pack;
    }

    @Column(name="emplacement")
    private  String emplacement;

    @Column(name="type_pack")
    private  String type_pack;


}

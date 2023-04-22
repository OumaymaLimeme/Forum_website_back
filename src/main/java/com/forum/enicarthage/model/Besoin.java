package com.forum.enicarthage.model;

import jakarta.persistence.*;

@Entity
@Table(name= "Besoin_materiel_table")
public class Besoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="besoin_id")
    private long besoin_id;

    public String getBesoin_tech() {
        return besoin_tech;
    }

    public void setBesoin_tech(String besoin_tech) {
        this.besoin_tech = besoin_tech;
    }

    public Besoin(long besoin_id, String besoin_tech, long facture, String besoin_log, long quantite, long prix, long total) {
        this.besoin_id = besoin_id;
        this.besoin_tech = besoin_tech;
        this.facture = facture;
        this.besoin_log = besoin_log;
        this.quantite = quantite;
        this.prix = prix;
        this.total = total;
    }

    public long getFacture() {
        return facture;
    }

    public void setFacture(long facture) {
        this.facture = facture;
    }

    public String getBesoin_log() {
        return besoin_log;
    }

    public void setBesoin_log(String besoin_log) {
        this.besoin_log = besoin_log;
    }

    @Column(name="besoin_tech")
    private  String besoin_tech;

    @Column(name = "facture")
    private long facture;

    public Besoin() {
        super();
    }

    public long getBesoin_id() {
        return besoin_id;
    }


    public void setBesoin_id(long besoin_id) {
        this.besoin_id = besoin_id;
    }
    public long getQuantite() {
        return quantite;
    }

    public void setQuantite(long quantite) {
        this.quantite = quantite;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    @Column(name="besoin_log")
    private  String besoin_log;

    @Column(name="quantite")
    private long quantite;

    @Column(name="prix")
    private  long prix;

    @Column(name="Total")
    private long total;

    public  long getTotal(){
        return  total;
    }
   public  void  setTotal(long total){

        this.total=this.prix*this.prix+this.facture;
   }
}

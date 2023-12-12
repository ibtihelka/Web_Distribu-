package com.example.annonce;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Annonce {
    private static final long serialVersionUID = 6;

    @Id
    @GeneratedValue
    private int id;
    private  String adresse, telephone, detail ;

    public Annonce() {
    }

    public Annonce(int id, String adresse, String telephone, String detail) {
        this.id = id;
        this.adresse = adresse;
        this.telephone = telephone;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public Annonce(String adresse, String telephone, String detail) {
        this.adresse = adresse;
        this.telephone = telephone;
        this.detail = detail;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

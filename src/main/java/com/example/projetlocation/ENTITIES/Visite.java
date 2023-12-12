package com.example.projetlocation.ENTITIES;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity

public class Visite implements Serializable {
    private static final long serialVersionUID = 6;
            @Id
           @GeneratedValue
    private Long id;
            private Date datevisite;
            private String nom ;
            private String prenom;
            private String email;
            private Number telephone;

    public Visite(Long id, Date datevisite, String nom, String prenom, String email, Number telephone) {
this.id = id;
    this.datevisite = datevisite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public Visite(Date datevisite, String nom, String prenom, String email, Number telephone) {
        this.datevisite = datevisite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public Visite() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatevisite() {
        return datevisite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public Number getTelephone() {
        return telephone;
    }




    public void setDatevisite(Date datevisite) {
        this.datevisite = datevisite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(Number telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Visite{" +
                "id=" + id +
                ", datevisite=" + datevisite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}

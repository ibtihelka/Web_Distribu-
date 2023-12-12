package com.example.Reclamation.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Reclamation implements Serializable {
        private  static final  long serialVersionUID =6 ;

        @Id
        @GeneratedValue
                //(strategy= GenerationType.IDENTITY)
        private  int id;
        private  String objet;
        private String description;

        public Reclamation() {
            super();
        }

        public Reclamation(int id, String objet, String description) {
            this.id = id;
            this.objet = objet;
            this.description = description;
        }

        public Reclamation(String objet, String description) {
            this.objet = objet;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public String getObjet() {
            return objet;
        }

        public String getDescription() {
            return description;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setObjet(String objet) {
            this.objet = objet;
        }

        public void setDescription(String description) {
            this.description = description;
        }
}

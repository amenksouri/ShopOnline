package com.example.shoponline.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name="CATEGORIE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Categorie implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Column(name="Nom_Categ")
    private String nomCategorie;

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}

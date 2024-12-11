package com.example.shoponline.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="INSCRIPTION")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Inscription {

    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Column(unique=true,name = "cin",nullable=false,length=8)
    private String cin;
    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }

    @Column(name = "nom")
    private String nom;
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(name = "type")
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "prenom")
    private String prenom;
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Column(name = "email")
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "age")
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "adresse")
    private String adresse;
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gouv")
    @Fetch(FetchMode.JOIN)
    private Gouvernoat gouvernoat;
    public String getGouvernoat() {
        return gouvernoat.getNom();
    }
    public void setGouvernoat(Gouvernoat gouvernoat) {
        this.gouvernoat = gouvernoat;
    }

}

package com.example.shoponline.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="COMMANDE")
public class Commande {


    @Id
    @GeneratedValue
    private long id;

    @Column(name = "idClient")
    private long idClient;


    @Column(name = "etat")
    private String etat;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "dateCommande")
    private Date dateCommande;



    public void consulterCommande() {
        // Implémentation de la consultation de commande
    }

    public void annulerCommande() {
        // Implémentation de l'annulation de commande
    }

    public void ajouterCommande() {
        // Implémentation de l'ajout de commande
    }

    public void modifierCommande() {
        // Implémentation de la modification de commande
    }

    public void chercherCommande() {
        // Implémentation de la recherche de commande
    }
}

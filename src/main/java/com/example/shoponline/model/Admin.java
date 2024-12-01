package com.example.shoponline.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="UTILISATEUR")
public class Admin extends Utilisateur{

    public void consulterProfil(long id) {
        // Implémentation de la consultation de profil
    }

    public void modifierProfil(Utilisateur utilisateur) {
        // Implémentation de la modification de profil
    }

    public void chercher(Utilisateur utilisateur) {
        // Implémentation de la recherche d'utilisateur
    }


}

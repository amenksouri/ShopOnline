package com.example.shoponline.Interfaces;

import com.example.shoponline.model.Utilisateur;

public interface IUtilisateur {
    boolean authentifier(String mail, String motDePasse);
    void inscrire(Utilisateur utilisateur);
    void inscrireUtilisateur(String nom, String prenom, String mail, String motDePasse);
}

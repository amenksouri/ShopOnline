package com.example.shoponline.Interfaces;

import org.springframework.http.ResponseEntity;

public interface IPanier {
    ResponseEntity<?> consulterPanier(int idClient);

    void ajouterProduitPanier(int idProduit, int idClient, int quantite, double total);

    void supprimerProduitPanier(int idPanier);
}

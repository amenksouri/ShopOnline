package com.example.shoponline.Services;

import com.example.shoponline.Interfaces.IPanier;
import com.example.shoponline.Repository.PanierRepository;
import com.example.shoponline.model.Panier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PanierService implements IPanier {

    @Autowired
    private PanierRepository panierRepository;

    @Override
    public ResponseEntity<?> consulterPanier(int idClient) {
        try {
            // Fetching the list of 'paniers' associated with the client
            List<Panier> paniers = panierRepository.findPanierByClient(idClient);

            // Check if the list is empty and send a message if no paniers are found
            if (paniers.isEmpty()) {
                return ResponseEntity.status(404).body("No items found in the panier for client ID: " + idClient);
            }

            // Return the list of paniers as JSON with HTTP status 200 (OK)
            return ResponseEntity.ok(paniers);

        } catch (Exception e) {
            // Log the error and return a proper error response
            return ResponseEntity.status(500).body("Error occurred while fetching panier for client ID: " + idClient);
        }
    }

    @Override
    public void ajouterProduitPanier(int idProduit, int idClient, int quantite, double total) {
        panierRepository.insertPanier(idProduit, idClient, quantite, total);
    }

    @Override
    public void supprimerProduitPanier(int idProduit) {
        panierRepository.deletePanierByProduit(idProduit);
    }
}

package com.example.shoponline.Controller;

import com.example.shoponline.Services.PanierService;
import com.example.shoponline.model.Panier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/panier")
public class PanierController {

    @Autowired
    private PanierService panierService;

    @GetMapping("/consulter/{idClient}")
    public ResponseEntity<?> consulterPanier(@PathVariable int idClient) {
        return panierService.consulterPanier(idClient);
    }

    @PostMapping("/ajouter")
    public void ajouterProduitPanier(@RequestBody Panier panier) {
        panierService.ajouterProduitPanier(
                panier.getIdProduit(),
                panier.getIdClient(),
                panier.getQuantite(),
                panier.getTotal()
        );
    }

    @DeleteMapping("/supprimer/{idProduit}")
    public void supprimerProduitPanier(@PathVariable int idProduit) {
        panierService.supprimerProduitPanier(idProduit);
    }
}

package com.example.shoponline.Interfaces;

import com.example.shoponline.model.Panier;
import com.example.shoponline.model.Product;

public interface IClient {
    public void consulterProfil(long id);

    public void modifierProfil();

    public void consulterProduit(int id);

    public void ajouterProduitAuPanier(int idPanier , int idProduct);

}

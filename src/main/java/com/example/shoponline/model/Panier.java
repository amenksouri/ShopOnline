package com.example.shoponline.model;


import jakarta.persistence.*;

@Entity
@Table(name="PANIER")
public class Panier {

    @Id
    @GeneratedValue
    public int id ;

    @Column(name = "idProduit")
    public int idProduit;


    @Column(name = "idClient")
    public int idClient;

    @Column(name = "quantite")
    public int quantite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Column(name = "total")
    public double total;
}

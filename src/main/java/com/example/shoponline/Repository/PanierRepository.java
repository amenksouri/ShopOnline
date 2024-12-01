package com.example.shoponline.Repository;

import com.example.shoponline.model.Panier;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PanierRepository extends JpaRepository<Panier, Integer> {

    @Query(value = "SELECT * FROM PANIER WHERE id_client = :idClient", nativeQuery = true)
    List<Panier> findPanierByClient(int idClient);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO PANIER (id,id_produit, id_client, quantite, total) VALUES ((SELECT COALESCE(MAX(id), 0)  + 1 FROM (SELECT id FROM PANIER) u),:idProduit, :idClient, :quantite, :total)", nativeQuery = true)
    void insertPanier(int idProduit, int idClient, int quantite, double total);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM PANIER WHERE id_produit = :idProduit", nativeQuery = true)
    void deletePanierByProduit(int idProduit);
}

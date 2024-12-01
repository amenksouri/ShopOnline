package com.example.shoponline.Repository;


import com.example.shoponline.model.Admin;
import com.example.shoponline.model.Client;
import com.example.shoponline.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    List<Admin> findAdminByRole(String role);  // Example to fetch Admin by role
    List<Client> findClientByRole(String role);
    List<Client> findVendeurByRole(String role);



    @Modifying
    @Query(value = "INSERT INTO UTILISATEUR (id, nom, prenom, mail, role, mot_de_passe, dtype) \n" +
            "VALUES ((SELECT MAX(u.id) + 1 FROM (SELECT id FROM UTILISATEUR) u), :nom, :prenom, :mail, 'UTILISATEUR', :motDePasse, 'Utilisateur')\n",
            nativeQuery = true)
    void inscrireUtilisateur(@Param("nom") String nom,
                             @Param("prenom") String prenom,
                             @Param("mail") String mail,
                             @Param("motDePasse") String motDePasse);

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END " +
            "FROM Utilisateur u WHERE u.mail = :mail AND u.motDePasse = :motDePasse")
    boolean authentifier(@Param("mail") String mail, @Param("motDePasse") String motDePasse);

}

package com.example.shoponline.Services;


import com.example.shoponline.Interfaces.IUtilisateur;
import com.example.shoponline.Repository.UtilisateurRepository;
import com.example.shoponline.model.Product;
import com.example.shoponline.model.Utilisateur;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService implements IUtilisateur {


    @Autowired
    public UtilisateurRepository utilisateurRepository;

    @Override
    public boolean authentifier(String mail, String motDePasse) {
        return utilisateurRepository.authentifier(mail, motDePasse);
    }

    @Override
    public void inscrire(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    @Transactional
    @Override
    public void inscrireUtilisateur(String nom, String prenom, String mail, String motDePasse) {
        utilisateurRepository.inscrireUtilisateur(nom, prenom, mail, motDePasse);
    }

}

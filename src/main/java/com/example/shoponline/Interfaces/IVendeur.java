package com.example.shoponline.Interfaces;

import com.example.shoponline.model.Utilisateur;

public interface IVendeur {

    public void consulterProfil(long id);

    public void modifierProfil(Utilisateur utilisateur);
}

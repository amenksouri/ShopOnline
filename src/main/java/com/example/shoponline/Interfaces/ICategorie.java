
package com.example.shoponline.Interfaces;

import com.example.shoponline.model.Categorie;

import java.util.List;

public interface ICategorie {
    public void  AddCategorie(Categorie categorie);
    public void  UpdateCategorie(Categorie categorie);
    public void  DeleteCategorie(Long id);


    public Categorie GetClientById(Long id);
    public List<Categorie> GetAllCategories();
}
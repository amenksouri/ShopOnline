package com.example.shoponline.Service;

import com.example.shoponline.model.Categorie;

import java.util.List;

public interface ICategorieService {
    public Categorie getCategorieById(Long id);
    public List<Categorie> getAllCategories();
    public Categorie addCategorie(Categorie categorie);
    public void updateCategorie(Categorie categorie);
    public void deleteCategorie(Categorie categorie);

}

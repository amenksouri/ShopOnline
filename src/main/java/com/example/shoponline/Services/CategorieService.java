package com.example.shoponline.Services;


import com.example.shoponline.Interfaces.ICategorie;
import com.example.shoponline.model.Categorie;
import com.example.shoponline.Repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService implements ICategorie {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public void AddCategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    @Override
    public void UpdateCategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    @Override
    public void DeleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public Categorie GetClientById(Long id) {
        return categorieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Categorie> GetAllCategories() {
        return categorieRepository.findAll();
    }
}


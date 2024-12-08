package com.example.shoponline.Service.implementation;

import com.example.shoponline.Service.ICategorieService;
import com.example.shoponline.model.Categorie;
import com.example.shoponline.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieImplementation implements ICategorieService {
    @Autowired
    private CategorieRepository categorieRepo;

    @Override
    public Categorie getCategorieById(Long id) {
        Optional<Categorie> op = categorieRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("Categorie avec l'Id "+ id +"n'existe pas");
        }
    }

    @Override
    public List<Categorie> getAllCategories() {
        return (List<Categorie>)categorieRepo.findAll();
    }

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return categorieRepo.save(categorie);
    }

    @Override
    public void updateCategorie(Categorie categorie) {
        categorieRepo.save(categorie);
    }

    @Override
    public void deleteCategorie(Categorie categorie) {
        categorieRepo.delete(categorie);
    }
}

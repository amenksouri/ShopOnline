package com.example.shoponline.Controller;

import com.example.shoponline.model.Categorie;
import com.example.shoponline.Services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping
    public ResponseEntity<String> addCategorie(@RequestBody Categorie categorie) {
        categorieService.AddCategorie(categorie);
        return new ResponseEntity<>("Category added successfully!", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategorie(@PathVariable Long id, @RequestBody Categorie categorie) {
        categorie.setId(id);
        categorieService.UpdateCategorie(categorie);
        return new ResponseEntity<>("Category updated successfully!", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategorie(@PathVariable Long id) {
        categorieService.DeleteCategorie(id);
        return new ResponseEntity<>("Category deleted successfully!", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorie> getCategorieById(@PathVariable Long id) {
        Categorie categorie = categorieService.GetClientById(id);
        return categorie != null
                ? new ResponseEntity<>(categorie, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<Categorie>> getAllCategories() {
        List<Categorie> categories = categorieService.GetAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}

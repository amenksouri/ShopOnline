package com.example.shoponline.Controller;

import com.example.shoponline.Services.UtilisateurService;
import com.example.shoponline.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

  /*  @PostMapping("/authentifier")
    public boolean authentifier(@RequestParam("mail") String mail, @RequestParam("password") String password) {
        return utilisateurService.authentifier(mail, password);
    }
    http://localhost:5050/api/utilisateur/authentifier?mail=john.doe@example.com&motDePasse=12345
    */
  @PostMapping("/authentifier")
  public boolean authentifier(@RequestBody Map<String, String> body) {
      String mail = body.get("mail");
      String motDePasse = body.get("motDePasse");

      if (mail == null || motDePasse == null) {
          throw new IllegalArgumentException("Both 'mail' and 'motDePasse' fields are required.");
      }

      return utilisateurService.authentifier(mail, motDePasse);
  }



    @PostMapping("/inscrire")
    public void inscrire(@RequestBody Utilisateur utilisateur) {
        utilisateurService.inscrire(utilisateur);
    }


    @PostMapping("/inscrireUtilisateur")
    public void inscrireUtilisateur(@RequestBody Map<String, String> utilisateurData) {
        String nom = utilisateurData.get("nom");
        String prenom = utilisateurData.get("prenom");
        String mail = utilisateurData.get("mail");
        String motDePasse = utilisateurData.get("motDePasse");

        utilisateurService.inscrireUtilisateur(nom, prenom, mail, motDePasse);
    }
}

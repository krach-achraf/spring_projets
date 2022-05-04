package ma.emsi.cours.spring.jpa3.controller;

import ma.emsi.cours.spring.jpa3.model.Projet;
import ma.emsi.cours.spring.jpa3.model.ProjetDev;
import ma.emsi.cours.spring.jpa3.model.ProjetRes;
import ma.emsi.cours.spring.jpa3.model.Tache;
import ma.emsi.cours.spring.jpa3.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projets")
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    @PostMapping("")
    public void ajouter(@RequestBody Projet projet) {
        projetService.ajouter(projet);
    }

    @PostMapping("/dev")
    public void ajouter(@RequestBody ProjetDev projetDev) {
        projetService.ajouter(projetDev);
    }

    @PostMapping("/res")
    public void ajouter(@RequestBody ProjetRes projetRes) {
        projetService.ajouter(projetRes);
    }

    @GetMapping("")
    public List<Projet> obtenirProjets() {
        return projetService.lesProjets();
    }

    @PostMapping("/{idProjet}/tache")
    public void ajouter(@PathVariable long idProjet, @RequestBody Tache tache) {
        projetService.ajouterTache(idProjet, tache);
    }

    @GetMapping("/{idProjet}/tache")
    public List<Tache> getTaches(@PathVariable long idProjet) {
        return projetService.getTaches(idProjet);
    }

}

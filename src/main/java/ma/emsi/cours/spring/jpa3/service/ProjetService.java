package ma.emsi.cours.spring.jpa3.service;

import ma.emsi.cours.spring.jpa3.model.Projet;
import ma.emsi.cours.spring.jpa3.model.ProjetDev;
import ma.emsi.cours.spring.jpa3.model.Tache;

import java.util.List;

public interface ProjetService {
    void ajouter(Projet projet);
    List<Projet> lesProjets();
    void spprimer(long idProjet);
    void modifier(Projet projet);
    Projet getProjet(long idProjet);
    void ajouterTache(long idProjet, Tache tache);
    List<Tache> getTaches(long idProjet);
    List<ProjetDev> lesProjetsDev();
    ProjetDev getProjetDev(long idProjet);
}

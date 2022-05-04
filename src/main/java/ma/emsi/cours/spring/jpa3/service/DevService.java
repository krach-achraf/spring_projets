package ma.emsi.cours.spring.jpa3.service;

import ma.emsi.cours.spring.jpa3.model.Developpeur;

import java.util.List;

public interface DevService {
    void ajouter(Developpeur developpeur);
    List<Developpeur> getDevs();
    void supprimer(int idDev);
    void modifier(Developpeur developpeur);
    Developpeur getDeveloppeur(int idDev);
    Developpeur getDeveloppeur(String email);
    List<Developpeur> getDev(long idProjet);
    void affecterTache(int idDev, int idTache);
}

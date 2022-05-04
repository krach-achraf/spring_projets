package ma.emsi.cours.spring.jpa3.service;

import ma.emsi.cours.spring.jpa3.model.Projet;
import ma.emsi.cours.spring.jpa3.model.ProjetDev;
import ma.emsi.cours.spring.jpa3.model.Tache;
import ma.emsi.cours.spring.jpa3.repository.ProjetRepository;
import ma.emsi.cours.spring.jpa3.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImpl implements ProjetService{

    @Autowired
    private TacheRepository tacheRepository;

    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public void ajouter(Projet projet) {
        projetRepository.save(projet);
    }

    @Override
    public List<Projet> lesProjets() {
        return projetRepository.findAll();
    }

    @Override
    public void spprimer(long idProjet) {
        projetRepository.deleteById(idProjet);
    }

    @Override
    public void modifier(Projet projet) {
        Projet p = projetRepository.getById(projet.getIdProjet());
        if(p != null){
            p.setDescription(projet.getDescription());
            projetRepository.save(p);
        }
    }

    @Override
    public Projet getProjet(long idProjet) {
        return projetRepository.getById(idProjet);
    }

    @Override
    public void ajouterTache(long idProjet, Tache tache) {
        ProjetDev projetDev = getProjetDev(idProjet);
        if(projetDev != null){
            tache.setProjetDev(projetDev);
            tacheRepository.save(tache);
        }
    }

    @Override
    public List<Tache> getTaches(long idProjet) {
        return projetRepository.getTaches(idProjet);
    }

    @Override
    public List<ProjetDev> lesProjetsDev() {
        return projetRepository.getProjetDevs();
    }

    @Override
    public ProjetDev getProjetDev(long idProjet) {
        return projetRepository.getProjetDev(idProjet);
    }
}

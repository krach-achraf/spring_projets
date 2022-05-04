package ma.emsi.cours.spring.jpa3.service;

import ma.emsi.cours.spring.jpa3.model.Developpeur;
import ma.emsi.cours.spring.jpa3.model.Tache;
import ma.emsi.cours.spring.jpa3.repository.DevRepository;
import ma.emsi.cours.spring.jpa3.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevServiceImpl implements DevService{

    @Autowired
    private DevRepository devRepository;

    @Autowired
    private TacheRepository tacheRepository;

    @Override
    public void ajouter(Developpeur developpeur) {
        devRepository.save(developpeur);
    }

    @Override
    public List<Developpeur> getDevs() {
        return devRepository.findAll();
    }

    @Override
    public void supprimer(int idDev) {
        devRepository.deleteById(idDev);
    }

    @Override
    public void modifier(Developpeur developpeur) {
        Developpeur d = devRepository.getById((developpeur.getId()));
        if(d != null)
            devRepository.save(d);
    }

    @Override
    public Developpeur getDeveloppeur(int idDev) {
        return devRepository.findById(idDev).get();
    }

    @Override
    public Developpeur getDeveloppeur(String email) {
        return devRepository.findByEmail(email);
    }

    @Override
    public List<Developpeur> getDev(long idProjet) {
        return devRepository.getDevs(idProjet);
    }

    @Override
    public void affecterTache(int idDev, int idTache) {
        Developpeur developpeur = devRepository.getById(idDev);
        Tache tache = tacheRepository.getById(idTache);
        if(developpeur != null && tache != null){
            developpeur.getTaches().add(tache);
            devRepository.save(developpeur);
        }
    }
}

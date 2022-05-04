package ma.emsi.cours.spring.jpa3.controller;

import ma.emsi.cours.spring.jpa3.model.Developpeur;
import ma.emsi.cours.spring.jpa3.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devs")
public class DevController {

    @Autowired
    private DevService devService;

    @PostMapping("")
    public void ajouter(@RequestBody Developpeur developpeur) {
        devService.ajouter(developpeur);
    }

    @GetMapping("")
    public List<Developpeur> get() {
        return devService.getDevs();
    }

    @GetMapping("/{idDev}")
    public Developpeur getDeveloppeur(@PathVariable int idDev) {
        return devService.getDeveloppeur(idDev);
    }

    @GetMapping("/projet/{idProjet}")
    public List<Developpeur> getDev(@PathVariable long idProjet) {
        return devService.getDev(idProjet);
    }

    @PostMapping("/{idDev}/{idTache}")
    public void affecter(@PathVariable int idDev,@PathVariable int idTache) {
        devService.affecterTache(idDev, idTache);
    }
}

package ma.emsi.cours.spring.jpa3.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float duree;

    @ManyToOne
    private ProjetDev projetDev;

    @ManyToMany
    private List<Developpeur> developpeurs;

    public Tache() {
    }

    public Tache(int id, float duree, ProjetDev projetDev) {
        this.id = id;
        this.duree = duree;
        this.projetDev = projetDev;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public ProjetDev getProjetDev() {
        return projetDev;
    }

    public void setProjetDev(ProjetDev projetDev) {
        this.projetDev = projetDev;
    }
}

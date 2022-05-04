package ma.emsi.cours.spring.jpa3.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Developpeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(unique = true)
    private String email;

    @ManyToMany(mappedBy = "developpeurs")
    private List<Tache> taches;

    public Developpeur() {
    }

    public Developpeur(int id, String nom, String email, List<Tache> taches) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.taches = taches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }
}

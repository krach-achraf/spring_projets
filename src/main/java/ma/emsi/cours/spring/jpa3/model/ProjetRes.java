package ma.emsi.cours.spring.jpa3.model;

import javax.persistence.Entity;

@Entity
public class ProjetRes extends Projet{
    private float budget;

    public ProjetRes() {
    }

    public ProjetRes(Long idProjet, String description, float budget) {
        super(idProjet, description);
        this.budget = budget;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
}

package ma.emsi.cours.spring.jpa3.model;

import javax.persistence.Entity;

@Entity
public class ProjetDev extends Projet{
    private String langage;

    public ProjetDev() {
    }

    public ProjetDev(Long idProjet, String description, String lanage) {
        super(idProjet, description);
        this.langage = lanage;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }
}

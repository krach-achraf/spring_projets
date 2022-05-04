package ma.emsi.cours.spring.jpa3.repository;

import ma.emsi.cours.spring.jpa3.model.Projet;
import ma.emsi.cours.spring.jpa3.model.ProjetDev;
import ma.emsi.cours.spring.jpa3.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {

    @Query(value = "select t from Tache t where t.projetDev.idProjet =: idProjet")
    List<Tache> getTaches(@Param("idPorojet") long idProjet);

    @Query("select  p from ProjetDev p")
    List<ProjetDev> getProjetDevs();

    @Query("select p from ProjetDev p where p.idProjet =: idP")
    ProjetDev getProjetDev(@Param("idP") long id);
}

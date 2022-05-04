package ma.emsi.cours.spring.jpa3.repository;

import ma.emsi.cours.spring.jpa3.model.Developpeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevRepository extends JpaRepository<Developpeur, Integer> {
    Developpeur findByEmail(String email);

    @Query("select d from Developpeur d join d.taches t where t.projetDev.idProjet =: idP")
    List<Developpeur> getDevs(@Param("idP") long idProjet);
}

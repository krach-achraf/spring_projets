package ma.emsi.cours.spring.jpa3.repository;

import ma.emsi.cours.spring.jpa3.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Integer> {
}

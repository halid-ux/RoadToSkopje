package mk.ukim.mk.roadtoskopje.repository;

import mk.ukim.mk.roadtoskopje.model.Fountain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FountainRepository extends JpaRepository<Fountain,Long> {
    List<Fountain> findByNameNotNull();
}

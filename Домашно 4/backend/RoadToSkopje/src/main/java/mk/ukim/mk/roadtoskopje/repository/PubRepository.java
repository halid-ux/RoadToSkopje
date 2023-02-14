package mk.ukim.mk.roadtoskopje.repository;

import mk.ukim.mk.roadtoskopje.model.Pub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PubRepository extends JpaRepository<Pub, Long> {
}
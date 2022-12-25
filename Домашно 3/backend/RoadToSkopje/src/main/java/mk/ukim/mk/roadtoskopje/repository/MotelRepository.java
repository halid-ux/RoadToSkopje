package mk.ukim.mk.roadtoskopje.repository;

import mk.ukim.mk.roadtoskopje.model.Motel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MotelRepository extends JpaRepository<Motel, Long> {
}
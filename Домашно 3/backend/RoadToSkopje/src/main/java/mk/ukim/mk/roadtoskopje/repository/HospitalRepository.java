package mk.ukim.mk.roadtoskopje.repository;
import mk.ukim.mk.roadtoskopje.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Long> {
    List<Hospital> findByNameNotNull();
}

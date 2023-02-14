package mk.ukim.mk.roadtoskopje.repository;
import mk.ukim.mk.roadtoskopje.model.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HostelRepository extends JpaRepository<Hostel,Long> {
    List<Hostel> findByNameNotNull();
}
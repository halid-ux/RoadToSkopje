package mk.ukim.mk.roadtoskopje.repository;


import mk.ukim.mk.roadtoskopje.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long> {
}
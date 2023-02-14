package mk.ukim.mk.roadtoskopje.repository;

import mk.ukim.mk.roadtoskopje.model.ExchangeOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExchangeOfficeRepository extends JpaRepository<ExchangeOffice, Long> {
    List<ExchangeOffice> findByNameNotNull();
}
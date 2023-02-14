package mk.ukim.mk.roadtoskopje.repository;

import mk.ukim.mk.roadtoskopje.model.Caffe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaffeRepository extends JpaRepository<Caffe, Long> {
    List<Caffe> findByNameNotNull();
}

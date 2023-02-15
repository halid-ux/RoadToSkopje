package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Fountain;
import mk.ukim.mk.roadtoskopje.repository.FountainRepository;
import mk.ukim.mk.roadtoskopje.service.FountainService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class FountainServiceImpl implements FountainService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final FountainRepository fountainRepository;

    public FountainServiceImpl(FountainRepository fountainRepository) {
        this.fountainRepository = fountainRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Fountain> listAll() {
        return this.fountainRepository.findByNameNotNull();
    }
}

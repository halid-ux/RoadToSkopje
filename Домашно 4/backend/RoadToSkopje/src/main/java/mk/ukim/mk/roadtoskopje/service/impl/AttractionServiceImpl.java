package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Attraction;
import mk.ukim.mk.roadtoskopje.repository.AttractionRepository;
import mk.ukim.mk.roadtoskopje.service.AttractionService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class AttractionServiceImpl implements AttractionService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final AttractionRepository attractionRepository;

    public AttractionServiceImpl(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Attraction> listAll() {
        return this.attractionRepository.findByNameNotNull();
    }
}

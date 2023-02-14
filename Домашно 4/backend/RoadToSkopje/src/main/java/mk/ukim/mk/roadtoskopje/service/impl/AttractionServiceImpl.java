package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Attraction;
import mk.ukim.mk.roadtoskopje.repository.AttractionRepository;
import mk.ukim.mk.roadtoskopje.service.AttractionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttractionServiceImpl implements AttractionService {

    private final AttractionRepository attractionRepository;

    public AttractionServiceImpl(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @Override
    public List<Attraction> listall() {
        return this.attractionRepository.findByNameNotNull();
    }
}

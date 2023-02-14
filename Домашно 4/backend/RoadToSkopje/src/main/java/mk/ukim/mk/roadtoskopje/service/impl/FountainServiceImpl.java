package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Fountain;
import mk.ukim.mk.roadtoskopje.repository.FountainRepository;
import mk.ukim.mk.roadtoskopje.service.FountainService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FountainServiceImpl implements FountainService {

    private final FountainRepository fountainRepository;

    public FountainServiceImpl(FountainRepository fountainRepository) {
        this.fountainRepository = fountainRepository;
    }

    @Override
    public List<Fountain> listAll() {
        return this.fountainRepository.findByNameNotNull();
    }
}

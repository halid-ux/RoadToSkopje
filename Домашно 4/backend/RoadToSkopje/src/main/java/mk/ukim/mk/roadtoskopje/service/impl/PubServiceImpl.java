package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Pub;
import mk.ukim.mk.roadtoskopje.repository.PubRepository;
import mk.ukim.mk.roadtoskopje.service.PubService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class PubServiceImpl implements PubService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final PubRepository pubRepository;

    public PubServiceImpl(PubRepository pubRepository) {
        this.pubRepository = pubRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Pub> listAll() {
        return this.pubRepository.findAll();
    }
}

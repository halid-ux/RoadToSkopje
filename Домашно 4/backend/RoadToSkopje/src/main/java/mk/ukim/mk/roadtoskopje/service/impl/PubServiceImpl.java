package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Pub;
import mk.ukim.mk.roadtoskopje.repository.PubRepository;
import mk.ukim.mk.roadtoskopje.service.PubService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PubServiceImpl implements PubService {

    private final PubRepository pubRepository;

    public PubServiceImpl(PubRepository pubRepository) {
        this.pubRepository = pubRepository;
    }

    @Override
    public List<Pub> listAll() {
        return this.pubRepository.findAll();
    }
}

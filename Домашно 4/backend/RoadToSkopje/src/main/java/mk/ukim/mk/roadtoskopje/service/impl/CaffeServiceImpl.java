package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Caffe;
import mk.ukim.mk.roadtoskopje.repository.CaffeRepository;
import mk.ukim.mk.roadtoskopje.service.CaffeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CaffeServiceImpl implements CaffeService {

    private final CaffeRepository caffeRepository;

    public CaffeServiceImpl(CaffeRepository caffeRepository) {
        this.caffeRepository = caffeRepository;
    }

    @Override
    public List<Caffe> listall() {
        return this.caffeRepository.findByNameNotNull();
    }
}

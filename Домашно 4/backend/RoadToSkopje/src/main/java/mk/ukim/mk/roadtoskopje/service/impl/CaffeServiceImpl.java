package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Caffe;
import mk.ukim.mk.roadtoskopje.repository.CaffeRepository;
import mk.ukim.mk.roadtoskopje.service.CaffeService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class CaffeServiceImpl implements CaffeService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final CaffeRepository caffeRepository;

    public CaffeServiceImpl(CaffeRepository caffeRepository) {
        this.caffeRepository = caffeRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Caffe> listAll() {
        return this.caffeRepository.findByNameNotNull();
    }
}

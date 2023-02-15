package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Motel;
import mk.ukim.mk.roadtoskopje.repository.MotelRepository;
import mk.ukim.mk.roadtoskopje.service.MotelService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is class for service implementation
 */
@Service
public class MotelServiceImpl implements MotelService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final MotelRepository motelRepository;

    public MotelServiceImpl(MotelRepository motelRepository) {
        this.motelRepository = motelRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Motel> listAll() {
        return this.motelRepository.findAll();
    }
}

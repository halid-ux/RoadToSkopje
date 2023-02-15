package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Parking;
import mk.ukim.mk.roadtoskopje.repository.ParkingRepository;
import mk.ukim.mk.roadtoskopje.service.ParkingService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is class for service implementation
 */
@Service
public class ParkingServiceImpl implements ParkingService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final ParkingRepository parkingRepository;

    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Parking> listAll() {
        return this.parkingRepository.findAll();
    }
}

package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Parking;
import mk.ukim.mk.roadtoskopje.repository.ParkingRepository;
import mk.ukim.mk.roadtoskopje.service.ParkingService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParkingServiceImpl implements ParkingService {

    private final ParkingRepository parkingRepository;

    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public List<Parking> listAll() {
        return this.parkingRepository.findAll();
    }
}

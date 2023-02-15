package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Hotel;
import mk.ukim.mk.roadtoskopje.repository.HotelRepository;
import mk.ukim.mk.roadtoskopje.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class HotelServiceImpl implements HotelService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Hotel> listAll() {
        return this.hotelRepository.findByNameNotNull();
    }
}

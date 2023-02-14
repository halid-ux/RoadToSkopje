package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Hotel;
import mk.ukim.mk.roadtoskopje.repository.HotelRepository;
import mk.ukim.mk.roadtoskopje.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> listAll() {
        return this.hotelRepository.findByNameNotNull();
    }
}

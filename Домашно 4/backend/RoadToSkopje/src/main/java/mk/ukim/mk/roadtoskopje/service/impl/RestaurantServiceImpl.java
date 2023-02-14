package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Restaurant;
import mk.ukim.mk.roadtoskopje.repository.RestaurantRepository;
import mk.ukim.mk.roadtoskopje.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> listAll() {
        return this.restaurantRepository.findByNameNotNull();
    }
}

package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin("*")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @GetMapping
    public ResponseEntity getAllRestaurants() {
        return ResponseEntity.ok(this.restaurantService.listAll());
    }
}
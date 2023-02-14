package mk.ukim.mk.roadtoskopje.web.controller;
import mk.ukim.mk.roadtoskopje.service.HotelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotels")
@CrossOrigin(origins = "http://localhost:3000")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    @GetMapping
    public ResponseEntity getAllHotels() {
        return ResponseEntity.ok(this.hotelService.listAll());
    }


}
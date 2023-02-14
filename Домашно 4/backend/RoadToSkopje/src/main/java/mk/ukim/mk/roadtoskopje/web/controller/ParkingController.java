package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.repository.ParkingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parkings")
@CrossOrigin(origins = "http://localhost:3000")
public class ParkingController {

    private final ParkingRepository repository;

    public ParkingController(ParkingRepository repository) {
        this.repository =  repository;
    }

    @GetMapping
    public ResponseEntity getAllParkings() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}
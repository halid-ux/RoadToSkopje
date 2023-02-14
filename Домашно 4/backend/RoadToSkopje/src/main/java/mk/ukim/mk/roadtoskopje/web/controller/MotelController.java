package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.repository.MotelRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motels")
@CrossOrigin(origins = "http://localhost:3000")
public class MotelController {

    private final MotelRepository repository;

    public MotelController(MotelRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity getAllMotels() {
        return ResponseEntity.ok(this.repository.findAll());
    }
}
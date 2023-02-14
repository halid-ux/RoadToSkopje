package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.service.FountainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fountains")
@CrossOrigin(origins = "http://localhost:3000")
public class FountainController {

    private final FountainService fountainService;

    public FountainController(FountainService fountainService) {
        this.fountainService = fountainService;
    }


    @GetMapping
    public ResponseEntity getAllFountains() {
        return ResponseEntity.ok(this.fountainService.listAll());
    }

}
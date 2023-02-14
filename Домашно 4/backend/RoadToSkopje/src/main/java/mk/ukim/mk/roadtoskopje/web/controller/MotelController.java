package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.service.MotelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motels")
@CrossOrigin(origins = "http://localhost:3000")
public class MotelController {

    private final MotelService motelService;

    public MotelController(MotelService motelService) {
        this.motelService = motelService;
    }
    @GetMapping
    public ResponseEntity getAllMotels() {
        return ResponseEntity.ok(this.motelService.listAll());
    }
}
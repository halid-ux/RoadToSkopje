package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.repository.CaffeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/caffes")
@CrossOrigin(origins = "http://localhost:3000")
public class CaffeController {
    private final CaffeRepository repository;
    public CaffeController(CaffeRepository repository){
        this.repository=repository;
    }
    @GetMapping
    public ResponseEntity getAllCaffes(){return ResponseEntity.ok(this.repository.findByNameNotNull());}
}
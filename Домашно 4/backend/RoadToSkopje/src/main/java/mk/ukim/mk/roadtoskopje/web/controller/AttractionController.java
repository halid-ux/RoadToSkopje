package mk.ukim.mk.roadtoskopje.web.controller;


import mk.ukim.mk.roadtoskopje.service.AttractionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attractions")
@CrossOrigin(origins = "http://localhost:3000" )
public class AttractionController {

 private final AttractionService attractionService;

    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping
    public ResponseEntity getAllAttractions(){return ResponseEntity.ok(this.attractionService.listall());}
}
package mk.ukim.mk.roadtoskopje.web.controller;
import mk.ukim.mk.roadtoskopje.service.PubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pubs")
@CrossOrigin(origins = "http://localhost:3000")
public class PubController {

    private final PubService pubService;

    public PubController(PubService pubService) {
        this.pubService = pubService;
    }


    @GetMapping
    public ResponseEntity getAllPubs() {
        return ResponseEntity.ok(this.pubService.listAll());
    }
}
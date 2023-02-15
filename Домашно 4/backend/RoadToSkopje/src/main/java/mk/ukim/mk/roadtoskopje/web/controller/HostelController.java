package mk.ukim.mk.roadtoskopje.web.controller;


import mk.ukim.mk.roadtoskopje.repository.HostelRepository;
import mk.ukim.mk.roadtoskopje.service.HostelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * This is Rest Controller in Java that is mapped on the path written in RequestMapping annotation.
 * This path is used like a default path for every mapped method in this class.
 */
@RestController
@RequestMapping("/api/hostels")
@CrossOrigin(origins = "http://localhost:3000")
public class HostelController {

    /**
     * Service is injected using this variable and the constructor.
     */
    private final HostelService hostelService;
    /**
     * Constructor with parameter.
     *
     * @param hostelService
     */
    public HostelController(HostelService hostelService) {
        this.hostelService = hostelService;
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllHostels() {
        return ResponseEntity.ok(this.hostelService.listAll());
    }


}
package mk.ukim.mk.roadtoskopje.web.controller;


import mk.ukim.mk.roadtoskopje.repository.HospitalRepository;
import mk.ukim.mk.roadtoskopje.service.HospitalService;
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
@RequestMapping("/api/hospitals")
@CrossOrigin(origins = "http://localhost:3000")
public class HospitalController {

    /**
     * Service is injected using this variable and the constructor.
     */
    private HospitalService hospitalService;
    /**
     * Constructor with parameter.
     *
     * @param hospitalService
     */
    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllHospitals() {
        return ResponseEntity.ok(this.hospitalService.listAll());
    }
}
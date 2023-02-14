package mk.ukim.mk.roadtoskopje.web.controller;


import mk.ukim.mk.roadtoskopje.repository.HospitalRepository;
import mk.ukim.mk.roadtoskopje.service.HospitalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hospitals")
@CrossOrigin(origins = "http://localhost:3000")
public class HospitalController {

    private HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping
    public ResponseEntity getAllHospitals() {
        return ResponseEntity.ok(this.hospitalService.listAll());
    }
}
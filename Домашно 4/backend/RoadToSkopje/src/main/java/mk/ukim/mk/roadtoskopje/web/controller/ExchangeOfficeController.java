package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.repository.ExchangeOfficeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchangeOffices")
@CrossOrigin(origins = "http://localhost:3000")
public class ExchangeOfficeController {
    private final ExchangeOfficeRepository repository;
    public ExchangeOfficeController(ExchangeOfficeRepository repository){
        this.repository=repository;
    }
    @GetMapping
    public ResponseEntity getAllExchange_Offices(){return ResponseEntity.ok(this.repository.findByNameNotNull());}
}
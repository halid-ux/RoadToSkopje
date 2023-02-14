package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.service.Exchange_OfficeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchangeOffices")
@CrossOrigin(origins = "http://localhost:3000")
public class ExchangeOfficeController {

    private final Exchange_OfficeService exchange_officeService;

    public ExchangeOfficeController(Exchange_OfficeService exchange_officeService) {
        this.exchange_officeService = exchange_officeService;
    }

    @GetMapping
    public ResponseEntity getAllExchange_Offices(){return ResponseEntity.ok(this.exchange_officeService.listAll());}
}
package mk.ukim.mk.roadtoskopje.web.controller;

import mk.ukim.mk.roadtoskopje.service.Exchange_OfficeService;
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
@RequestMapping("/api/exchangeOffices")
@CrossOrigin(origins = "http://localhost:3000")
public class ExchangeOfficeController {

    /**
     * Service is injected using this variable and the constructor.
     */
    private final Exchange_OfficeService exchange_officeService;
    /**
     * Constructor with parameter.
     *
     * @param exchange_officeService
     */
    public ExchangeOfficeController(Exchange_OfficeService exchange_officeService) {
        this.exchange_officeService = exchange_officeService;
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllExchange_Offices(){return ResponseEntity.ok(this.exchange_officeService.listAll());}
}
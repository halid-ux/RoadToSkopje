package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.ExchangeOffice;
import mk.ukim.mk.roadtoskopje.repository.ExchangeOfficeRepository;
import mk.ukim.mk.roadtoskopje.service.Exchange_OfficeService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class Exchange_OfficeServiceImpl implements Exchange_OfficeService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final ExchangeOfficeRepository exchangeOfficeRepository;

    public Exchange_OfficeServiceImpl(ExchangeOfficeRepository exchangeOfficeRepository) {
        this.exchangeOfficeRepository = exchangeOfficeRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<ExchangeOffice> listAll() {
        return this.exchangeOfficeRepository.findByNameNotNull();
    }
}

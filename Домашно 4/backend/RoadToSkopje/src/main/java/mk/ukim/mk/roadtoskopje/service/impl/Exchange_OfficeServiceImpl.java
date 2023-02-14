package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.ExchangeOffice;
import mk.ukim.mk.roadtoskopje.repository.ExchangeOfficeRepository;
import mk.ukim.mk.roadtoskopje.service.Exchange_OfficeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Exchange_OfficeServiceImpl implements Exchange_OfficeService {

    private final ExchangeOfficeRepository exchangeOfficeRepository;

    public Exchange_OfficeServiceImpl(ExchangeOfficeRepository exchangeOfficeRepository) {
        this.exchangeOfficeRepository = exchangeOfficeRepository;
    }

    @Override
    public List<ExchangeOffice> listAll() {
        return this.exchangeOfficeRepository.findByNameNotNull();
    }
}

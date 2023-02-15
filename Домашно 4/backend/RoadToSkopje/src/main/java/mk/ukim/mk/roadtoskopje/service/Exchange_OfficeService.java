package mk.ukim.mk.roadtoskopje.service;

import mk.ukim.mk.roadtoskopje.model.ExchangeOffice;

import java.util.List;
/**
 * This is java interface that is implemented from every class accordingly
 */
public interface Exchange_OfficeService {
    /**
     * Method that is listing valus from the model
     *
     * @return
     */
    List<ExchangeOffice> listAll();
}

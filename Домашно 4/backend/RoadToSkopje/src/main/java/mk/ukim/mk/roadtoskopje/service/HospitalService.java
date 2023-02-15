package mk.ukim.mk.roadtoskopje.service;

import mk.ukim.mk.roadtoskopje.model.Hospital;

import java.util.List;
/**
 * This is java interface that is implemented from every class accordingly
 */
public interface HospitalService {
    /**
     * Method that is listing valus from the model
     *
     * @return
     */
    List<Hospital> listAll();
}

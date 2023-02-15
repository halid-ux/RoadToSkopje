package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Hospital;
import mk.ukim.mk.roadtoskopje.repository.HospitalRepository;
import mk.ukim.mk.roadtoskopje.service.HospitalService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class HospitalServiceImpl implements HospitalService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final HospitalRepository  hospitalRepository;

    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Hospital> listAll() {
        return this.hospitalRepository.findByNameNotNull();
    }
}

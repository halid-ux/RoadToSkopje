package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Hospital;
import mk.ukim.mk.roadtoskopje.repository.HospitalRepository;
import mk.ukim.mk.roadtoskopje.service.HospitalService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HospitalServiceImpl implements HospitalService {

    private final HospitalRepository  hospitalRepository;

    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospital> listAll() {
        return this.hospitalRepository.findByNameNotNull();
    }
}

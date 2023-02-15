package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Hostel;
import mk.ukim.mk.roadtoskopje.repository.HostelRepository;
import mk.ukim.mk.roadtoskopje.service.HostelService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This is class for service implementation
 */
@Service
public class HostelServiceImpl implements HostelService {
    /**
     * With this variable and the construcor we are injecting the repository layer
     * for each class accordingly
     */
    private final HostelRepository hostelRepository;

    public HostelServiceImpl(HostelRepository hostelRepository) {
        this.hostelRepository = hostelRepository;
    }
    /**
     * This is method and this methods function is to find the names that have not null values.
     *
     * @return
     */
    @Override
    public List<Hostel> listAll() {
        return this.hostelRepository.findByNameNotNull();
    }
}

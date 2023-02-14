package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Hostel;
import mk.ukim.mk.roadtoskopje.repository.HostelRepository;
import mk.ukim.mk.roadtoskopje.service.HostelService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HostelServiceImpl implements HostelService {

    private final HostelRepository hostelRepository;

    public HostelServiceImpl(HostelRepository hostelRepository) {
        this.hostelRepository = hostelRepository;
    }

    @Override
    public List<Hostel> listAll() {
        return this.hostelRepository.findByNameNotNull();
    }
}

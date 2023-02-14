package mk.ukim.mk.roadtoskopje.service.impl;

import mk.ukim.mk.roadtoskopje.model.Motel;
import mk.ukim.mk.roadtoskopje.repository.MotelRepository;
import mk.ukim.mk.roadtoskopje.service.MotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotelServiceImpl implements MotelService {

    private final MotelRepository motelRepository;

    public MotelServiceImpl(MotelRepository motelRepository) {
        this.motelRepository = motelRepository;
    }

    @Override
    public List<Motel> listAll() {
        return this.motelRepository.findAll();
    }
}

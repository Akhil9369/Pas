package com.example.service;

import com.example.entity.Stop;
import com.example.repository.StopRepository;
import org.springframework.stereotype.Service;

@Service
public class StopServiceImpl implements StopService {

    private StopRepository stopRepository;

    public StopServiceImpl(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }
    @Override
    public Stop addStop(Stop stop) {
        Stop newStop=stopRepository.save(stop);
        return newStop;
    }
}

package com.example.service;

import com.example.entity.Bus;
import com.example.repository.BusRepository;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    private BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public Bus createBus(Bus bus) {
        Bus newBus = busRepository.save(bus);
        return newBus;
    }
}

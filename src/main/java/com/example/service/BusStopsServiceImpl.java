package com.example.service;

import com.example.entity.Bus;
import com.example.entity.BusStops;
import com.example.entity.Stop;
import com.example.repository.BusRepository;
import com.example.repository.BusStopsRepository;
import com.example.repository.StopRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BusStopsServiceImpl implements BusStopsService {

    private    BusRepository busRepository;

    private  StopRepository stopRepository;

    private  BusStopsRepository busStopsRepository;

    public BusStopsServiceImpl(BusRepository busRepository, StopRepository stopRepository, BusStopsRepository busStopsRepository) {
        this.busRepository = busRepository;
        this.stopRepository = stopRepository;
        this.busStopsRepository = busStopsRepository;
    }

    @Override
    @Transactional
    public BusStops allocateBusRoute(long busId, long stopId, BusStops busStops) {

            Bus bus=busRepository.findById(busId).get();

            Stop stop=stopRepository.findById(stopId).get();

            busStops.setBus(bus);
            busStops.setStop(stop);

            BusStops saved =busStopsRepository.save(busStops);
            return saved;
    }
}

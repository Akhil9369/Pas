package com.example.service;

import com.example.entity.BusStops;

public interface BusStopsService {
    BusStops allocateBusRoute(long busId, long stopId, BusStops busStops);
}

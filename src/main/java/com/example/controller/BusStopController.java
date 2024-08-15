package com.example.controller;

import com.example.entity.BusStops;
import com.example.service.BusService;
import com.example.service.BusStopsService;
import com.example.service.StopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bus-stops")
public class BusStopController {

    private final BusStopsService busStopsService;
    private final StopService stopService;
    private final BusService busService;

    public BusStopController(BusStopsService busStopsService, StopService stopService, BusService busService) {
        this.busStopsService = busStopsService;
        this.stopService = stopService;
        this.busService = busService;
    }

    @PostMapping("/assign")
    public ResponseEntity<BusStops> assignBusToStop(
            @RequestParam long busId,
            @RequestParam long stopId,
            @RequestBody BusStops busStops
    ){
        BusStops savedEntity = busStopsService.allocateBusRoute(busId, stopId,busStops);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }
}

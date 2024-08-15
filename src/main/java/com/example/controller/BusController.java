package com.example.controller;


import com.example.entity.Bus;
import com.example.service.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    private BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;

    }
    @RequestMapping
    public ResponseEntity<Bus> createBus(
            @RequestBody Bus bus
    ){
        Bus savedEntity = busService.createBus(bus);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }
}

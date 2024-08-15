package com.example.controller;

import com.example.entity.Stop;
import com.example.service.StopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stop")
public class StopController {

    private StopService stopService;

    public StopController(StopService stopService) {
        this.stopService = stopService;
    }
    @RequestMapping
    public ResponseEntity<Stop> addStop(@RequestBody Stop stop) {
        Stop savedStop = stopService.addStop(stop);
        return new ResponseEntity<>(savedStop, HttpStatus.CREATED);


    }
}

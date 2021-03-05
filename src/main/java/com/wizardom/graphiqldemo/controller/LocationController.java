package com.wizardom.graphiqldemo.controller;

import com.wizardom.graphiqldemo.model.Location;
import com.wizardom.graphiqldemo.repository.LocationRepository;
import com.wizardom.graphiqldemo.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class LocationController {

    private final LocationService locationService;

    @GetMapping()
    public List<Location> getLocations() {
        return locationService.getAllLocations();
    }

}

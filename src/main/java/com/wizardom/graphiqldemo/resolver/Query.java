package com.wizardom.graphiqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.wizardom.graphiqldemo.model.Location;
import com.wizardom.graphiqldemo.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@CommonsLog
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final LocationRepository locationRepository;

    List<Location> findAllLocations(){
        return locationRepository.findAll();
    }
}

package com.wizardom.graphiqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.wizardom.graphiqldemo.model.Location;
import com.wizardom.graphiqldemo.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final LocationRepository locationRepository;

    public List<Location> findAllLocations(){
        return locationRepository.findAll();
    }
}

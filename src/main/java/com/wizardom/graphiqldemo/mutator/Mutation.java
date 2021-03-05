package com.wizardom.graphiqldemo.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.wizardom.graphiqldemo.model.Location;
import com.wizardom.graphiqldemo.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private final LocationRepository locationRepository;

    public Location newLocation(String name, String address) {
        return locationRepository.save(new Location().setLocationName(name).setLocationAddress(address));
    }

    public boolean deleteLocation(Long id) {
        if (locationRepository.findById(id).isPresent()) {
            locationRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Location updateLocation(String newName, Long id){
        Optional<Location> location = locationRepository.findById(id);
        if (location.isPresent()){
            return locationRepository.save(location.get().setLocationName(newName));
        }
        else  {
            throw new EntityNotFoundException();
        }
    }
}

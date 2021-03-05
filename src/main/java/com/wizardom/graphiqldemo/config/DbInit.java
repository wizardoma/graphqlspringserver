package com.wizardom.graphiqldemo.config;

import com.wizardom.graphiqldemo.model.Location;
import com.wizardom.graphiqldemo.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DbInit implements CommandLineRunner {
    final LocationRepository locationRepository;

    @Override
    public void run(String... args) throws Exception {
        if (locationRepository.findById(1L).isEmpty()) {
            locationRepository.save(new Location()
                    .setLocationAddress("Atlanta Airport Location")
                    .setLocationName("ATL Location"));
            locationRepository.save(new Location()
                    .setLocationAddress("Miami Airport Location")
                    .setLocationName("MIA Location"));
            locationRepository.save(new Location()
                    .setLocationAddress("Los Angeles Airport Location")
                    .setLocationName("LAX Location"));
        }
    }
}

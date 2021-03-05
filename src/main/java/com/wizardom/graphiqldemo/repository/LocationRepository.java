package com.wizardom.graphiqldemo.repository;

import com.wizardom.graphiqldemo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {


}

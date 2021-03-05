package com.wizardom.graphiqldemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Location {
    @Id @GeneratedValue
    private Long id;
    private String locationName;
    private String locationAddress;


}

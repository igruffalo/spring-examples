package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /*
    The @Autowired annotation marks on a field, constructor, Setter method is used to auto-wire the beans that is
    'injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism
     */

//    @Autowired(required = false)



    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

}

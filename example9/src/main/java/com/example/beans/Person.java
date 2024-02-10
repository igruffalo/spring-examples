package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {

        System.out.println("Person bean created by Spring.");
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

    public void setName(String name) {
        this.name = name;
    }
}

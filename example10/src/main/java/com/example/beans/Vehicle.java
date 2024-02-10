package com.example.beans;

import com.example.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
        System.out.println("Hashcode of VehicleService bean inside Vehicle bean is : " + vehicleService.hashCode());
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    @Override
    public String toString() {
        String name = "toyota";
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

}

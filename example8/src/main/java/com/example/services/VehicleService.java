package com.example.services;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    private Tyre tyres;
    @Autowired
    private Speaker speakers;

    public void makeSound() {
        speakers.makeSound();
    }

    public void moveVehicle() {
        tyres.rotate();
    }




}

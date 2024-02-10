package com.example.services;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {

    public VehicleService() {
        System.out.println("VehicleService bean created by Spring.");
    }

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

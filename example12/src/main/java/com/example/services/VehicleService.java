package com.example.services;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import com.example.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {

    @Autowired
    private Tyre tyres;
    @Autowired
    private Speaker speakers;

    private Logger logger = Logger.getLogger(VehicleService.class.getName());


    public String playMusic(boolean vehicleStarted, Song song) {
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        return tyres.rotate();
    }

    public String applyBrakes(boolean vehicleStarted) {
        return tyres.stop();
    }

}

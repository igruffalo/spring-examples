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
        Instant start = Instant.now();
        logger.info("Method execution started.");
        String music = null;
        if(vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation.");
        }
       logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("Method execution started.");
        String status = null;
        if(vehicleStarted) {
            status = tyres.rotate();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation.");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return status;
    }

    public String applyBrakes(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("Method execution started.");
        String status = null;
        if(vehicleStarted) {
            status = tyres.stop();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation.");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return status;
    }




}

package com.example.implementations;

import com.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class Sony implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Sony speaker makes sound.");
    }
}

package com.example.implementations;

import com.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bose implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Bose speaker making sound.");
    }
}

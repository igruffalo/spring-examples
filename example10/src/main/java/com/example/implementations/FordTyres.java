package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class FordTyres implements Tyre {
    @Override
    public void rotate() {
        System.out.println("Ford tyres are running.");
    }
}

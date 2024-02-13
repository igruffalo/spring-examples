package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class FordTyres implements Tyre {
    @Override
    public String rotate() {
        return "Ford tyres are running.";
    }

    @Override
    public String stop() {
        return "Ford tyres stopped running";
    }

}

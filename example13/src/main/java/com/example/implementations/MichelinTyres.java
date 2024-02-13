package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyre {
    @Override
    public String rotate() {
        return "Michelin tyres are running";
    }

    @Override
    public String stop() {
        return "Michelin tyres stopped running.";
    }
}

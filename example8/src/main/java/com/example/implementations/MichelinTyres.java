package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyre {
    @Override
    public void rotate() {
        System.out.println("Michelin tyres are running");
    }
}

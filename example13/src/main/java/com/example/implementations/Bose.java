package com.example.implementations;

import com.example.interfaces.Speaker;
import com.example.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bose implements Speaker {

    @Override
    public String makeSound(Song song) {
        return "Bose speaker playing song " + song.getTitle() + " by singer " + song.getSingerName();
    }
}

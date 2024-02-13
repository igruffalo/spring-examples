package com.example.implementations;

import com.example.interfaces.Speaker;
import com.example.model.Song;
import org.springframework.stereotype.Component;

@Component
public class Sony implements Speaker {

    @Override
    public String makeSound(Song song) {

        return "Sony speaker playing song " + song.getTitle() + " by singer " + song.getSingerName();
    }
}

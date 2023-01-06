package com.nimikin.spring_practice.music;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class JazzMusic implements Music {
    @Value("#{${jazzMusicList}}")
    private List<String> jazzMusicList;
    private final Random r = new Random();

    @Override
    public String getRandomSong() {
        return this.jazzMusicList.get(r.nextInt(3));
    }
}

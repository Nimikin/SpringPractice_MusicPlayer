package com.nimikin.spring_practice.music;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    @Value("#{${rockMusicList}}")
    private List<String> rockMusicList;
    private final Random r = new Random();

    @Override
    public String getRandomSong() {
        return this.rockMusicList.get(r.nextInt(3));
    }
}

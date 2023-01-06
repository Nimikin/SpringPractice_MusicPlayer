package com.nimikin.spring_practice.music;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    @Value("#{${rockMusicList}}")
    private List<String> rockMusicList;

    @Override
    public String getRandomSong() {
        return this.rockMusicList.get(new Random().nextInt(3));
    }
}

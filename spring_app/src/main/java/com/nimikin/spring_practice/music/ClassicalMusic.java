package com.nimikin.spring_practice.music;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {
    @Value("#{${classicalMusicList}}")
    private List<String> classicalMusicList;

    @Override
    public String getRandomSong() {
        return this.classicalMusicList.get(new Random().nextInt(3));
    }
}

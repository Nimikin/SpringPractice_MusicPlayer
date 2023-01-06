package com.nimikin.spring_practice.music;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private final List<Music> musicList;
    private final Random r = new Random();

    public MusicPlayer(@Qualifier("musicList") List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        return "Now playing: " + musicList.get(r.nextInt(3)).getRandomSong();
    }
}

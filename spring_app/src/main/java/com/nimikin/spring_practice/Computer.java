package com.nimikin.spring_practice;

import com.nimikin.spring_practice.music.MusicPlayer;

public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic();
    }
}

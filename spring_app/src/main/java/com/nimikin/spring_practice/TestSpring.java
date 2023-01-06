package com.nimikin.spring_practice;

import com.nimikin.spring_practice.config.SpringConfig;
import com.nimikin.spring_practice.music.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        
        context.close();
    }
}

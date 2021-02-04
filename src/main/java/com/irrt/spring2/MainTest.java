package com.irrt.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
     //   Music music = context.getBean("musicBean", Music.class);
     //   MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        musicPlayer.setVolume(10);

        System.out.println();

        System.out.println("Жанр музыки: " + musicPlayer.getName() + ". Уровень громкости: " + musicPlayer.getVolume());

        singleTone(musicPlayer, secondMusicPlayer);
        context.close();
    }
    public static void singleTone(MusicPlayer firstMusicPlayer, MusicPlayer secondMusicPlayer){
        boolean b;
        boolean b1;

        b = firstMusicPlayer.equals(secondMusicPlayer);
        System.out.println(b);

        b1 = firstMusicPlayer == secondMusicPlayer;
        System.out.println(b);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

    }
}


package com.irrt.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        //вызываем кофинурационный файл JAVA
       AnnotationConfigApplicationContext annotationConfigApplicationContext =
               new AnnotationConfigApplicationContext(SpringConfig.class);



        List<Music> music = new ArrayList<Music>(Arrays.asList(new ClassicalMusic(), new RockMusic(), new PopMusic()));
        MusicPlayer musicPlayer = new MusicPlayer(music);
        System.out.println(musicPlayer.playMusic());


       //вызываем кофинурационный файл XML
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");



        //      Music music = context.getBean("c", Music.class);
//      MusicPlayer musicPlayer = new MusicPlayer();
//      musicPlayer.playMusic();
//        Music music1 = context.getBean("classical", Music.class);
//        Music music2 = context.getBean("pop", Music.class);
//        List<MusicPlayer> musicPlayers = new ArrayList<>();
//        musicPlayers.add(new MusicPlayer(music));
//        musicPlayers.add(new MusicPlayer(music1));
//        musicPlayers.add(new MusicPlayer(music2));
//
//        for (Iterator<MusicPlayer> iterator = musicPlayers.iterator(); iterator.hasNext(); ) {
//            MusicPlayer next = iterator.next();
//            next.playMusic();
//        }


        //   MusicPlayer musicPlayer = new MusicPlayer(music);

//MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //    musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        System.out.println(musicPlayer.getName() + ", " + musicPlayer.getVolume());
//       context.close();


    }
}


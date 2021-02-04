package com.irrt.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;


    //  ClassicalMusic classicalMusic;
    //  RockMusic rockMusic;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }
@Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }


    public void playMusic() {
        System.out.println("Играет музыка: " + music.getSong());
        }
//
//    public void doMyInit(){
//        System.out.println("Делаю инициализацию");
//    }
//    public void doMyDestroy(){
//        System.out.println("Делаю уничтожение бина");
//    }


}

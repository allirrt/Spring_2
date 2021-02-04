package com.irrt.spring2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
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

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Iterator<Music> iterator = musicList.iterator(); iterator.hasNext(); ) {
            Music next = iterator.next();
            System.out.println("Играет музыка: " + next.getSong());
        }
    }
    public void doMyInit(){
        System.out.println("Делаю инициализацию");
    }
    public void doMyDestroy(){
        System.out.println("Делаю уничтожение бина");
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}

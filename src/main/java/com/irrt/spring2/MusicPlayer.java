package com.irrt.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;


@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;
    private Music music3;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classical") Music music1, @Qualifier("rock") Music music2, @Qualifier("pop") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic() {
        Music[] arr = {music1, music2, music3}; //returned by Enum.values(), you get the idea
        Random random = new Random();
        int st = random.nextInt(arr.length);
        Music randElement = arr[st];

        return "Играет музыка: " + randElement.getSong();
    }

    @PostConstruct //запкчкается при инициализации
    public void doMyInit() {
        System.out.println("Делаю инициализацию бина");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Делаю уничтожение бина");
    }


}

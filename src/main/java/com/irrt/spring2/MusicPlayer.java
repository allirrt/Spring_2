package com.irrt.spring2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {
  @Value("${musicPlayer.name}")
    private String name;
   @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> music = new ArrayList<Music>(Arrays.asList(new ClassicalMusic(), new RockMusic(), new PopMusic()));

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String playMusic() {

        Random random = new Random();
        int st = random.nextInt(music.size());
        Music randElement = music.get(st);

        return "Играет музыка: " + randElement.getSong();
    }

    public List<Music> getMusic() {
        return music;
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

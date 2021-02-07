package com.irrt.spring2;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.irrt.spring2")
@PropertySource(value = "musicplayer.properties")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> music(){
        return new ArrayList<>(Arrays.asList(rockMusic(),popMusic(),classicalMusic()));
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(music());
    }

    @Bean

    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
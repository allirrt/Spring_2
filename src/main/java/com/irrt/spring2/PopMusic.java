package com.irrt.spring2;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PopMusic implements Music {


    @Override
    public String getSong() {
        String[] playList = {"Миллион алых роз ", "Любовь была одна", "Весна пришла"};
        Random random = new Random();
        int st = random.nextInt(playList.length);
        String randElement = playList[st];


        return randElement;
    }
}
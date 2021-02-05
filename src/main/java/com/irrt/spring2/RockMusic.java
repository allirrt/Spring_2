package com.irrt.spring2;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("rock")
public class RockMusic implements Music {

    @Override
    public String getSong() {
        String[] playList = {"Я свободен", "Хочу перемен", "Гудбай Америка"};
        Random random = new Random();
        int st = random.nextInt(playList.length);
        String randElement = playList[st];


        return randElement;
    }
}
//    Random random = new Random();
//    // Массив из пяти цветов
//    int colors[] = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED,
//            Color.CYAN };
//    int pos = random.nextInt(colors.length);
//// Меняем цвет у кнопки
//    mButton.setBackgroundColor(colors[pos]);
//            }
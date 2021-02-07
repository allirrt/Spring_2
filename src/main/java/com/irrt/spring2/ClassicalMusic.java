package com.irrt.spring2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("singleton")
//@Scope("prototype")/будут создаваться разные объекты пр инициализции бина
public class ClassicalMusic implements Music {


    //создаем фабричный метод
//    private ClassicalMusic(){}
//
//   public static ClassicalMusic getClassicalMusic(){
//       return new ClassicalMusic();
//   }

    //    public void doMyInit(){
//        System.out.println("Делаю инициализацию");
//    }
//    public void doMyDestroy(){
//        System.out.println("Делаю уничтожение бина");
//    }
    @Override
    public String getSong() {
        String[] playList = {"Времена года", "Венская ночь", "Лебединное озеро"};
        Random random = new Random();
        int st = random.nextInt(playList.length);
        String randElement = playList[st];


        return randElement;
    }
}

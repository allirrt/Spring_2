package com.irrt.spring2;

import org.springframework.stereotype.Component;

//@Component("classical")
public class ClassicalMusic implements Music
{
   //создаем фабричный метод
//    private ClassicalMusic(){}
//
//   public static ClassicalMusic getClassicalMusic(){
//       return new ClassicalMusic();
//   }

    public void doMyInit(){
        System.out.println("Делаю инициализацию");
    }
    public void doMyDestroy(){
        System.out.println("Делаю уничтожение бина");
    }
    @Override
    public String getSong() {
        return "Времена года";
    }
}

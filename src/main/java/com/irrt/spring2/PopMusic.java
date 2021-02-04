package com.irrt.spring2;

import org.springframework.stereotype.Component;

//@Component("pop")
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Madonna";
    }
}

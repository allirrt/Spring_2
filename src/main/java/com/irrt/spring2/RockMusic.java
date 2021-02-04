package com.irrt.spring2;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "AC/DC";
    }
}

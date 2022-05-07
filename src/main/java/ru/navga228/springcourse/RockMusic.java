package ru.navga228.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String GetMusic() {
        return "Hard Rock";
    }
}

package ru.navga228.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer(){} // Пустой конструктор нужен тк когда мы создаем свой собственный конструктор, то конструктор по умолчанию удаляется

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
        return "Playing: " + music1.GetMusic() + ", " + music2.GetMusic();
    }
}

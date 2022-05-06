package ru.navga228.springcourse;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

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

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){} // Пустой конструктор нужен тк когда мы создаем свой собственный конструктор, то конструктор по умолчанию удаляется

    public void setMusic(Music music) {
        this.music = music;
    }


    public void playMusic() {
        System.out.println("Playing: " + music.GetMusic());
    }
}

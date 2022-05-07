package ru.navga228.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){ // Factory-method для создания новго бина
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String GetMusic() {
        return "Symphony No. 40 W.A. Mozart";
    }
}

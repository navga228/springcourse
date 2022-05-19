package ru.navga228.springcourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    // Тестируем работу спринга (Создание бинов)
    public static void main(String[] args) {

        // ClassPathXmlApplicationContext Этот класс отвечает за то чтобы считать файл applicationContext.xml, считывает его и помещает все бины которые там описаны в applicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer1 == musicPlayer2);

        context.close(); // После работы с applicationContex'ом его нужно обязательно закрывать
    }
}

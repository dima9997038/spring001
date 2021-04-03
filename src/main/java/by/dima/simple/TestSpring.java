package by.dima.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
 //       ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
//        Music music =context.getBean("someRocklMusic", Music.class);
//        Music music2 =context.getBean("someClassicalMusic", Music.class);
//        MusicPlayer musicPlayer= new MusicPlayer(music);
//        MusicPlayer musicPlayer2= new MusicPlayer(music2);
//        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        musicPlayer2.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 =context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 =context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1==classicalMusic2);

        context.close();

    }
}

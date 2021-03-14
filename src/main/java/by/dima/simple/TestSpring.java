package by.dima.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music =context.getBean("someRocklMusic", Music.class);
        Music music2 =context.getBean("someClassicalMusic", Music.class);
        MusicPlayer musicPlayer= new MusicPlayer(music);
        MusicPlayer musicPlayer2= new MusicPlayer(music2);
//        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer2.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();

    }
}

package by.dima.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

//    private ClassicalMusic classicalMusic;
//    private List<Music> musicList= new ArrayList<>();
//    private String name;
//    private int volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public MusicPlayer() {
//    }

//    public MusicPlayer(Music music) {
//        this.music=music;
//    }

     String playMusic(){
        return  "Playing: "+ music1.getSong()+", "+ music2.getSong();
     //   System.out.println("Playing: "+ music.getSong());
//        for (Music m:musicList ) {
//            System.out.println("Playing: " + m.getSong());
//        }
    }
//@Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
}

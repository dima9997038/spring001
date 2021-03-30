package by.dima.simple;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("rockMusic")
public class RockMusic implements Music {



    private static List<String> rockMusicList=Arrays.asList("Wind cries Mary", "Yesterday", "Yellow submarine");
    @Override
    public String getSong()
    {
        Random rand = new Random();

        return rockMusicList.get(rand.nextInt(rockMusicList.size()));
    }
}

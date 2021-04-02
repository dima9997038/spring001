package by.dima.simple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("classicalMusic")
@Scope("prototype")
public class ClassicalMusic implements Music {


    private static List<String> classicalMusicList=Arrays.asList("Hungarian Rhapsody", "Sonata", "Opera");


    @Override
    public String getSong() {

        Random rand = new Random();

        return classicalMusicList.get(rand.nextInt(classicalMusicList.size()));
    }
}

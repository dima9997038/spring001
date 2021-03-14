package by.dima.simple;

import org.springframework.stereotype.Component;

@Component("someRocklMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

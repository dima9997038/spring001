package by.dima.simple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.dima.simple")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

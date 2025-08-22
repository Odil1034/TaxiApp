package soft.club.taxizmati.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SessionUser {

    @Bean
    public Long getId() {
        return new Random().nextLong(1, 50);
    }
}

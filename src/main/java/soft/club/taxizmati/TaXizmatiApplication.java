package soft.club.taxizmati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TaXizmatiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaXizmatiApplication.class, args);
    }

}

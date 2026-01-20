package newton.footballmanager.cli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "newton.footballmanager")
public class FootballManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballManagerApplication.class, args);
    }

}

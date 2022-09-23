package sia.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //annotation showing that it is Spring Boot app
public class TacoCloudApplication {

    public static void main(String[] args) {
        //we run app here
        SpringApplication.run(TacoCloudApplication.class, args);
    }
}

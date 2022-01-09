package by.ginel.lib.starter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "by.ginel.lib.dao.entity")
class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

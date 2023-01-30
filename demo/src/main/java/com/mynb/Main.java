package demo.src.main.java.com.mynb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Main {
    @SpringBootApplication
    @RestController
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String greet() {
        return "Hello Moto";
    }
}

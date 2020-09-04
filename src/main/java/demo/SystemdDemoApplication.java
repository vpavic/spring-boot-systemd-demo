package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SystemdDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemdDemoApplication.class, args);
    }

    @GetMapping(path = "/")
    public String home() {
        return "Hello, World!";
    }

}

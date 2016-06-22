package org.toilelibre.libe.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lbenychou on 22/06/2016.
 */
@RestController
@SpringBootApplication
public class Helloworld {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Helloworld.class, args);
    }

}
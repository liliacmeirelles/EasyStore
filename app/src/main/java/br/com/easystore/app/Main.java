package br.com.easystore.app;

import br.com.easystore.app.configuration.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
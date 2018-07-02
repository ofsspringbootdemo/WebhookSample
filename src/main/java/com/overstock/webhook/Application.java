package com.overstock.webhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Jana on 7/2/2018.
 */
@SpringBootApplication(scanBasePackages="com.overstock.webhook")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

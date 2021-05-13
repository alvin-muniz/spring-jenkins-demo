package com.sei.springjenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(SpringJenkinsDemoApplication.class, args);
    }

}

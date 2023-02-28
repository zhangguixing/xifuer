package com.flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description 学习kafka
 * @since 2023-02-28 10:31:03
 */
@SpringBootApplication
public class StudyKafkaApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(StudyKafkaApplication.class, args);
    }

}
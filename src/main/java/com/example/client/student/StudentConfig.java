package com.example.client.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 4)
            );

            Student carolina = new Student(
                    "Carolina",
                    "carolina@gmail.com",
                    LocalDate.of(1983, Month.NOVEMBER, 5)
            );

            repository.saveAll(
                    List.of(john, carolina)
            );
        };
    }
}

package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student tshepo = new Student(
                    "Tshepo",
                    "tsheporonald@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 10)

            );

            Student thobe = new Student(
                    "Thobe",
                    "ZwideThobe@gmail.com",
                    LocalDate.of(2003, Month.APRIL, 15)

            );


            repository.saveAll(
                    Arrays.asList(tshepo,thobe)
            );
        };

    }
}

package com.thecheckers.nonsopracticedemo.Student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
@Slf4j
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student nonso = new Student(
                    "Nonso",
                    25,
                    LocalDate.of(1996, Month.JANUARY, 21),
                    "edceebee@gmail.com"
            );
            Student chidi = new Student(
                    "Chidi",
                    25,
                    LocalDate.of(1996, Month.JANUARY, 21),
                    "chidi@gmail.com"
            );
            Student gbenga = new Student(
                    "Gbenga",
                    27,
                    LocalDate.of(1994, Month.JANUARY, 21),
                    "gbenga@gmail.com"
            );


            repository.saveAll(
                    List.of(nonso, chidi, gbenga)
            );

            log.info("Objects-->{}", repository.findAll());
        };

    }
}

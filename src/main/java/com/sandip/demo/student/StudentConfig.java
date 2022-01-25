package com.sandip.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student sandip = new Student(
                    "Sandip Deb",
                    "sandipdeb@gmail.com",
                    LocalDate.of(1998, Month.JULY,5)
            );
            Student nilatpal = new Student(
                    "Nilatpal Das",
                    "nilatpaldas@gmail.com",
                    LocalDate.of(1997, Month.SEPTEMBER,19)
            );
            repository.saveAll(
                    List.of(sandip,nilatpal)
            );
        };
    }
}

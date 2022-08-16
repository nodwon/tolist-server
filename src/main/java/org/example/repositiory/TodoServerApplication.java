package org.example.repositiory;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Data
@SpringBootApplication
public class TodoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoServerApplication.class, args);
    }

}
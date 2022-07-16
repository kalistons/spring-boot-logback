package br.com.springframe.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LogbackApplication {

	public static void main(String[] args) {
		log.info("this is a info message");
		log.warn("this is a warn message");
		log.error("this is a error message");
		SpringApplication.run(LogbackApplication.class, args);
	}

}

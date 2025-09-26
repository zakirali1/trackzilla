package com.zak.trackzilla;

import org.slf4j.LoggerFactory;
import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.zak.trackzilla.model.Application;
import com.zak.trackzilla.respository.ApplicationRepository;

@SpringBootApplication
public class TrackzillaApplication {

	private static Logger log = LoggerFactory.getLogger(TrackzillaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TrackzillaApplication.class, args);
		
	}

	@Bean
		public CommandLineRunner demo(ApplicationRepository repository ) {
			return (args) -> {
				repository.save(new Application("Trackzilla", "kesha.williams", "Application for tracking bugs."));
				repository.save(new Application("Expenses", "mary.jones", "Application to track expense reports."));
				repository.save(new Application("Notifications", "karen.kane", "Application to send alerts an notifications"));

				for (Application application : repository.findAll()) {
					log.info("The aplication is: " + application.toString());
				}
			};

		}

}

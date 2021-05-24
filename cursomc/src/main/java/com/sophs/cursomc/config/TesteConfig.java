package com.sophs.cursomc.config;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sophs.cursomc.services.DBService;
import com.sophs.cursomc.services.EmailService;
import com.sophs.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class TesteConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}	
}
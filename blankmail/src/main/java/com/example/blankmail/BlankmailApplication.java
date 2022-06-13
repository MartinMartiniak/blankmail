package com.example.blankmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.*;

import javax.mail.MessagingException;

@SpringBootApplication
public class BlankmailApplication {

	@Autowired
	private EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(BlankmailApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		senderService.sendSimpleEmail("rtmike183@gmail.com",
				"predmet sefe",
				"mailujeme more co je");

	}
}
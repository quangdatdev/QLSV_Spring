package com.se.spring.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
	
	
	@Autowired
	private Environment env;
	@Autowired
	private JavaMailSender mailSender;
	private String maOTP;

	@PostMapping("/otp")
	public String getOTP(@RequestBody String mailOTP) {
		Random foo = new Random();
		int randomNumber = foo.nextInt(9999 - 1000) + 1000;
		String from = env.getProperty("spring.mail.username");
		String to = mailOTP;

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject("This is a plain text email");
		message.setText("Hello guys!!!!" + "OTP CODE : " + String.valueOf(randomNumber));

		mailSender.send(message);

		maOTP = String.valueOf(randomNumber);
		return maOTP;
	}
}

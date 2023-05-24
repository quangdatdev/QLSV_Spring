package com.se.spring.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
=======
import com.se.spring.dto.AccountDTO;
import com.se.spring.entity.Account;
import com.se.spring.service.AccountService;

>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
	
	
<<<<<<< HEAD
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
=======
	

	@Autowired
	private AccountService service;
	
	@PostMapping("/getAccount")
	public Account getAccount(@RequestBody AccountDTO accdto) {
		return service.getAccount(accdto);
	}
	@PostMapping("/otp")
	public String getOTP(@RequestBody String mailOTP) {
		return service.getOTP(mailOTP);
	}
	
	public String checkAccount(@RequestBody Account acc) {
		return service.checkAccount(acc);
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
	}
}

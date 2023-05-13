package com.se.spring.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.spring.dto.AccountDTO;
import com.se.spring.entity.Account;
import com.se.spring.service.AccountService;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
	
	
	

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
	}
}

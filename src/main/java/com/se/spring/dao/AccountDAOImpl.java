package com.se.spring.dao;

import java.util.Random;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;

import com.se.spring.dto.AccountDTO;
import com.se.spring.entity.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Environment env;
	@Autowired
	private JavaMailSender mailSender;
	private String maOTP;

	@Override
	@Transactional
	public Account getAccount(AccountDTO accdto) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Account> query = currentSession.createNativeQuery("SELECT *\r\n" + "FROM   Account" + " where uid = '"
				+ accdto.getUid() + "' " + "and password = '" + accdto.getPassword() + "'", Account.class);
		Account lstFaculty = query.uniqueResult();
		return lstFaculty;
	}

	@Override
	public String getOTP(String mailOTP) {
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

	@Override
	@Transactional
	public String checkAccount(Account acc) {
//		Session currentSession = sessionFactory.getCurrentSession();
//		Query<Account> query = currentSession
//				.createNativeQuery("SELECT *\r\n" + "FROM   Account" + " where uid = '" + acc.getAccount_id() + "'", Account.class);
//		Account lstFaculty = query.uniqueResult();
		return "";
	}

}

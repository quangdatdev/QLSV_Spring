package com.se.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.AccountDAO;
import com.se.spring.dto.AccountDTO;
import com.se.spring.entity.Account;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDAO dao;

	@Override
	@Transactional
	public Account getAccount(AccountDTO uid) {
		// TODO Auto-generated method stub
		return dao.getAccount(uid);
	}

	@Override
	@Transactional
	public String getOTP(String mailOTP) {
		// TODO Auto-generated method stub
		return dao.getOTP(mailOTP);
	}

	@Override
	@Transactional
	public String checkAccount(Account acc) {
		// TODO Auto-generated method stub
		return dao.checkAccount(acc);
	}
	
	
	
}

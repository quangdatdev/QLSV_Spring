package com.se.spring.service;

import com.se.spring.dto.AccountDTO;
import com.se.spring.entity.Account;

public interface AccountService {

	Account getAccount(AccountDTO accdto);

	String getOTP(String mailOTP);

	String checkAccount(Account acc);

	
}

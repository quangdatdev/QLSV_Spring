package com.se.spring.dao;

import com.se.spring.dto.AccountDTO;
import com.se.spring.entity.Account;

public interface AccountDAO {

	Account getAccount(AccountDTO uid);

	String getOTP(String mailOTP);

	String checkAccount(Account acc);

}

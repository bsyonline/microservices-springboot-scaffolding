package com.rolex.microservices.account.service;

import com.rolex.microservices.account.dto.AccountDto;

public interface AccountService {

    AccountDto create(String name, String email, String phoneNumber);
}

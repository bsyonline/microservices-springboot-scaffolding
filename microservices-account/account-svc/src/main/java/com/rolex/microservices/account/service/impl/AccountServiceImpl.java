package com.rolex.microservices.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rolex.microservices.account.dao.entity.Account;
import com.rolex.microservices.account.dao.mapper.AccountMapper;
import com.rolex.microservices.account.dto.AccountDto;
import com.rolex.microservices.account.service.AccountService;

/**
 * @author rolex
 * @since 2023/9/23
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public AccountDto create(String name, String email, String phoneNumber) {
        Account account = Account.builder().build();
        account.setName(name);
        account.setEmail(email);
        account.setPhoneNumber(phoneNumber);
        accountMapper.insert(account);
        return AccountDto.builder().build();
    }
}

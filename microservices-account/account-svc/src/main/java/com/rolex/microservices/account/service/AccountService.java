package com.rolex.microservices.account.service;

import com.rolex.microservices.account.dto.AccountDto;

/**
 * @author rolex
 * @since 2023/9/23
 */
public interface AccountService {

    AccountDto create(String name, String email, String phoneNumber);
}

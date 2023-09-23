package com.rolex.microcservices.account.controller;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rolex.microcservices.account.vo.CreateAccountRequest;
import com.rolex.microcservices.account.vo.GenericAccountResponse;
import com.rolex.microservices.account.dto.AccountDto;
import com.rolex.microservices.account.service.AccountService;

/**
 * @author rolex
 * @since 2023/9/23
 */
@RestController
@RequestMapping("/v1/account")
@Validated
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(path = "/create")
    public GenericAccountResponse createAccount(@RequestBody @Valid CreateAccountRequest request) {
        AccountDto accountDto = accountService.create(request.getName(), request.getEmail(), request.getPhoneNumber());
        GenericAccountResponse genericAccountResponse = new GenericAccountResponse(accountDto);
        return genericAccountResponse;
    }
}

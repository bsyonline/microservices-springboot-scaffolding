package com.rolex.microservices.account.controller;

import javax.validation.ConstraintViolationException;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.rolex.microcservices.account.controller.AccountController;
import com.rolex.microcservices.account.vo.CreateAccountRequest;
import com.rolex.microcservices.account.vo.GenericAccountResponse;

@ExtendWith(SpringExtension.class)
@Slf4j
@SpringBootTest
public class AccountControllerTest {

    @BeforeEach
    public void setUp() {

    }

    @Autowired
    AccountController controller;

    @Test
    public void testCreateAccountValidation1() {
        // empty request
        CreateAccountRequest createAccountRequest = CreateAccountRequest.builder().build();
        Assertions.assertThrows(ConstraintViolationException.class,
                () -> controller.createAccount(createAccountRequest),
                "createAccount.request.validRequest: Empty request");
    }

    @Test
    public void testCreateAccountValidation2() {
        // invalid email
        CreateAccountRequest createAccountRequest = CreateAccountRequest.builder().email("invalid_email").build();
        Assertions.assertThrows(ConstraintViolationException.class,
                () -> controller.createAccount(createAccountRequest), "createAccount.request.email: Invalid email");
    }

    @Test
    public void testCreateAccountValidation3() {
        // invalid phone number
        CreateAccountRequest createAccountRequest =
                CreateAccountRequest.builder().phoneNumber("invalid_phonenumber").build();
        Assertions.assertThrows(ConstraintViolationException.class,
                () -> controller.createAccount(createAccountRequest),
                "createAccount.request.phoneNumber: Invalid phone number");
    }

    @Test
    public void testCreateAccountValidation4() {
        String phoneNumber = "18001801236";
        CreateAccountRequest createAccountRequest = CreateAccountRequest.builder()
                .name("tom")
                .email("test@ms.com")
                .phoneNumber(phoneNumber).build();
        GenericAccountResponse genericAccountResponse = controller.createAccount(createAccountRequest);
        log.info(genericAccountResponse.toString());
        Assertions.assertTrue(genericAccountResponse.isSuccess());
    }

    @AfterEach
    public void destroy() {

    }
}

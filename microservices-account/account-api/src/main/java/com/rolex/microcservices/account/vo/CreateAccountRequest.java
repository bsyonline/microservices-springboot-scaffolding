package com.rolex.microcservices.account.vo;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.util.StringUtils;

import com.rolex.microcservices.common.validation.PhoneNumber;

/**
 * @author rolex
 * @since 2023/9/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAccountRequest {

    private String name;
    @Email(message = "Invalid email")
    private String email;
    @PhoneNumber
    private String phoneNumber;

    @AssertTrue(message = "Empty request")
    private boolean isValidRequest() {
        return StringUtils.hasText(name) || StringUtils.hasText(email) || StringUtils.hasText(phoneNumber);
    }

}

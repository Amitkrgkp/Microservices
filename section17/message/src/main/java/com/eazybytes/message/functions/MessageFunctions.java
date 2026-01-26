package com.eazybytes.message.functions;

import com.eazybytes.message.dto.AccountsMsgDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {

    private static final Logger log = LoggerFactory.getLogger(MessageFunctions.class);

    @Bean
    public Function <AccountsMsgDto, AccountsMsgDto> email() {
        return accountsMsgDto -> {
            log.info("Received account message: {}", accountsMsgDto);
            // Here you can add logic to send email using the account information
            log.info("Sending email to: {}", accountsMsgDto.email());
            // Simulate email sending
            log.info("Email sent successfully to: {}", accountsMsgDto.email());
            return accountsMsgDto;
        };
    }

    @Bean
    public Function <AccountsMsgDto, Long> sms() {
        return accountsMsgDto -> {
            log.info("Received account message: {}", accountsMsgDto);
            // Here you can add logic to send SMS using the account information
            log.info("Sending SMS to: {}", accountsMsgDto.mobileNumber());
            // Simulate SMS sending
            log.info("SMS sent successfully to: {}", accountsMsgDto.mobileNumber());
            return accountsMsgDto.accountNumber();
        };
    }

}

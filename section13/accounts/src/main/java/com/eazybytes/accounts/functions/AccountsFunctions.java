package com.eazybytes.accounts.functions;

import com.eazybytes.accounts.service.IAccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AccountsFunctions {

    private static final Logger log = LoggerFactory.getLogger(AccountsFunctions.class);

    @Bean
    public Consumer<Long> updateCommunication(IAccountsService accountsService) {
        return accountNumber -> {
            log.info("Updating communication status for the account number: {}", accountNumber);
            // Here you can add logic to update communication preferences in the database
            accountsService.updateCommunicationStatus(accountNumber);
            log.info("Communication preferences updated successfully for account number: {}", accountNumber);
        };
    }
}

package com.eazybytes.accounts.dto;

/*
    * DTO for Account Message Service
    * Used to transfer account information
    * between different layers of the application
    * and to external systems.
    *
    * @param accountNumber - Unique identifier for the account
    * @param name - Name of the account holder
    * @param email - Email address of the account holder
    * @param mobileNumber - Mobile number of the account holder
 */
public record AccountsMsgDto(Long accountNumber, String name, String email, String mobileNumber) {
}

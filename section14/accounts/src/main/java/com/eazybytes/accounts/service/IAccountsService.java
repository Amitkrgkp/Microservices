package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Creates a new customer account based on the provided CustomerDto.
     *
     * @param customerDto the data transfer object containing customer details
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetches the customer details based on the provided mobile number.
     *
     * @param mobileNumber the mobile number of the customer
     * @return the CustomerDto containing customer details
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates the customer account based on the provided CustomerDto.
     *
     * @param customerDto the data transfer object containing updated customer details
     * @return true if the update was successful, false otherwise
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Deletes the customer account based on the provided mobile number.
     *
     * @param mobileNumber the mobile number of the customer
     * @return true if the deletion was successful, false otherwise
     */
    boolean deleteAccount(String mobileNumber);

    /**
     * Updates the communication status for the given account number.
     *
     * @param accountNumber the account number for which to update the communication status
     * @return true if the update was successful, false otherwise
     */
    boolean updateCommunicationStatus(Long accountNumber);
}

package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    /**
     * Fetches customer details based on the provided mobile number.
     *
     * @param mobileNumber The mobile number of the customer.
     * @return CustomerDetailsDto containing the customer's details.
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}

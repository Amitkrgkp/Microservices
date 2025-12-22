package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    /**
     * Fetches customer details based on the provided mobile number and correlation ID.
     *
     * @param mobileNumber  The mobile number of the customer.
     * @param correlationId The correlation ID for tracking the request.
     * @return CustomerDetailsDto containing the customer's details.
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}

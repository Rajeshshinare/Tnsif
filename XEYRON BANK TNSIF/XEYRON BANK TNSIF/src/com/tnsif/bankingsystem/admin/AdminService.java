package com.tnsif.bankingsystem.admin;

import com.tnsif.bankingsystem.model.Customer;
import java.util.List;


public interface AdminService {
    boolean verifyCustomer(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerById(int customerId);
}

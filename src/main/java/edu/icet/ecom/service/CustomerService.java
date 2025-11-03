package edu.icet.ecom.service;

import edu.icet.ecom.model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    List<Customer> getAll();
    Customer findById(String id);
    List<Customer> findByName(String name);
}

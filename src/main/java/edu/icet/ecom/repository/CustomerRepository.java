package edu.icet.ecom.repository;

import edu.icet.ecom.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
        List<Customer> findByName(String name);
}

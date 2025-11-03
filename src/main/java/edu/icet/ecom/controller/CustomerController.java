package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/name")
    public String getName(){
        return "Saman";
    }

    @GetMapping("/age")
    public Integer getAge(){
        return 22;
    }

    @GetMapping("/get-customer")
    public Customer getCustomer(){
        return new Customer(
            "1",
            "Thisara",
            "Panadura",
            20000.0
        );

    }

}

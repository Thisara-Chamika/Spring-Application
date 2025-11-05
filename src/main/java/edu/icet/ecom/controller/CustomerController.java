package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://http://localhost:5173")
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

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

    @GetMapping("/get-all")
    public List<Customer> getAll(){
            return service.getAll();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/find-by-id/{id}")
    public Customer findById(@PathVariable  String id){
        return service.findById(id);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Customer> findByName(@PathVariable String name){
        return service.findByName(name);
    }

}

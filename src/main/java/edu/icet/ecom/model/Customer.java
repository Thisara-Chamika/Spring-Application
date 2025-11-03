package edu.icet.ecom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Customer {
    @Id
    @Column(name="id", length = 6)
    private String id;
    private String name;
    private String address;
    private Double salary;
}

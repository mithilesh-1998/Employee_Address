package com.geekster.EmployeeAddress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address")
    Address address;
}

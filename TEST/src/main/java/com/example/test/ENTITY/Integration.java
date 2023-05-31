package com.example.test.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "integration")
public class Integration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id;
    @Column(name = "Product")
    private String Product;
    @Column(name = "Location")
    private String Location;
    @Column(name = "Address")
    private String Address;
}

package com.cg.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true, updatable = false)
    private String email;
    private String phone;
    private String address;

    @Column(columnDefinition = "decimal(10,0) default 0", nullable = false, updatable = false)
    private BigDecimal balance = BigDecimal.ZERO;
    private Boolean deleted;

}

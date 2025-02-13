package com.ranjit.EComKart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranjit.EComKart.Domain.USER_ROLE;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String email;

    private String fullname;

    private String mobile;

    private USER_ROLE userRole=USER_ROLE.ROLE_CUSTOMER;

    @OneToMany
    private Set<Address> address=new HashSet<>();

    @ManyToMany
    @JsonIgnore
    private Set<Coupon> usedCoupons= new HashSet<>();

}

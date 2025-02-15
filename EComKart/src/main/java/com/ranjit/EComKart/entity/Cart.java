package com.ranjit.EComKart.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;
// casecadeType.All meaning when we change something in cartItems it will reflect on cart aswell
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CartItems> cartItems=new HashSet<>();

    private double totalSellingPrice;

    private int totalItem;

    private int totalMrpPrice;

    private int discount;

    private String couponCode;


}

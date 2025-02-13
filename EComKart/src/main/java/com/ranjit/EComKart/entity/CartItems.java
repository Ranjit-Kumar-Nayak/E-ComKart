package com.ranjit.EComKart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonIgnore
    private Cart cart;

    private Product product;

    private String size;

    private int quantity=1;

    private Integer mrpPrice;

    private Integer sellingsPrice;

    private Long userId;


}

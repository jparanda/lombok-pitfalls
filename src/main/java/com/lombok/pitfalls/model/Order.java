package com.lombok.pitfalls.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Order {

    @Id
    private Long id;

    private String customer;

    @OneToMany(mappedBy = "order")
    private Set<OrderPosition> positions = new HashSet<>();
}

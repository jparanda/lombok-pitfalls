package com.lombok.pitfalls.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Order {

    private Long id;

    private String customer;

    @OneToMany(mappedBy = "order")
    private Set<OrderPosition> positions = new HashSet<>();

    public Long getId() {
        return id;
    }
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Set<OrderPosition> getPositions() {
        return positions;
    }

    public void setPositions(Set<OrderPosition> positions) {
        this.positions = positions;
    }
}

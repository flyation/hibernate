package com.southwind.entity.one2many;

import lombok.Data;

import java.util.Set;

@Data
public class Customer {
    private Integer id;
    private String name;
    private Set<Order> orders;
}

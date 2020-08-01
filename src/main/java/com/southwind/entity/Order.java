package com.southwind.entity;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String name;
    private Customer customer;
}

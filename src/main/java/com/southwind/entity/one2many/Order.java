package com.southwind.entity.one2many;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String name;
    private Customer customer;
}

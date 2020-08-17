package com.southwind.entity.one2many;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Integer id;
    private String name;
    private Customer customer;
}

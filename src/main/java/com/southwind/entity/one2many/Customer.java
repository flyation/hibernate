package com.southwind.entity.one2many;

import lombok.Data;

import java.util.Set;

@Data
public class Customer {
    private Integer id;
    private String name;
    private Set<Order> orders;

    // 覆盖原来的toString()，去掉orders，避免toString()套娃
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

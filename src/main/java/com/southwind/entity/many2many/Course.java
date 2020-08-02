package com.southwind.entity.many2many;

import lombok.Data;

import java.util.Set;

@Data
public class Course {
    private Integer id;
    private String name;
    private Set<Account> accounts;
}

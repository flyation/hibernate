package com.southwind.entity.many2many;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Account {
    private Integer id;
    private String name;
    private Set<Course> courses;
}

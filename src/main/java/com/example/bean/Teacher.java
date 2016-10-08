package com.example.bean;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2016/9/13.
 */
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "teachers")
    private List<Person> persons;
}

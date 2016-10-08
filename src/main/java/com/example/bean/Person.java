package com.example.bean;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2016/9/13.
 */
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne
    private Idcard idcard;

    @OneToMany(mappedBy = "person")
    private List<Cellphone> cellphones;

    @ManyToMany
    private List<Teacher> teachers;
}

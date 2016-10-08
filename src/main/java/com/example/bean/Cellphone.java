package com.example.bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/9/13.
 */
@Entity
public class Cellphone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String no;

    @ManyToOne
    private Person person;
}

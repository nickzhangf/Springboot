package com.example.bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/9/13.
 */
@Entity
public class Idcard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String no;

    @OneToOne(mappedBy = "idcard")
    private Person person;
}

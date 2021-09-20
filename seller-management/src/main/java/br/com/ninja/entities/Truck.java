package br.com.ninja.entities;

import javax.persistence.*;

@Entity(name = "management.trucks")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @Column(name = "model_id")
//    private Model model;

}

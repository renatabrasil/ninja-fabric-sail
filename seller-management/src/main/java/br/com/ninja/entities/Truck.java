package br.com.ninja.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity(name = "management.trucks")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //    @Column(name = "model_id")
//    @OneToMany
//    @JoinColumn(name = "models_id")
////    @RestResource(path = "libraryAddress", rel = "address")
//    private Model model;

}

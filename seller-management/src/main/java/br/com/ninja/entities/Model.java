package br.com.ninja.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "management.models")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}

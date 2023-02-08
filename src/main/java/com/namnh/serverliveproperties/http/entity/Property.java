package com.namnh.serverliveproperties.http.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "property")
@ToString
public class Property {

    @Transient
    public static final Property EMPTY = new Property("", "");
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String val;

    public Property(){

    }

    public Property(String name, String val) {
        this.name = name;
        this.val = val;
    }

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}

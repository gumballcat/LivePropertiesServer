package com.namnh.serverliveproperties.http.entity;

import jakarta.persistence.*;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "property")
@ToString
public class Property extends RepresentationModel<Property> {

    @Transient
    public static final Property EMPTY = new Property("", "");
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String val;

    public Property() {

    }

    public Property(String name, String val) {
        this.name = name;
        this.val = val;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
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

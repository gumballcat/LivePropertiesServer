package com.namnh.serverliveproperties.http.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "property")
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Property {

    @Transient
    public static final Property EMPTY = new Property("", "");
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String val;

    public Property(String name, String val) {
        setName(name);
        setVal(val);
    }
}

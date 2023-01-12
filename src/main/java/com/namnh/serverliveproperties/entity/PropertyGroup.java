package com.namnh.serverliveproperties.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "property_group")
@ToString
@NoArgsConstructor
@Getter
@Setter
public class PropertyGroup {

    @Transient
    public static final PropertyGroup EMPTY = new PropertyGroup("");

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public PropertyGroup(String name){
        setName(name);
    }
}

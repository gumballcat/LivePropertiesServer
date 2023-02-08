package com.namnh.serverliveproperties.http.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class User {

    private final @Id long id;
    private final String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}

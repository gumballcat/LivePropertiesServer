package com.namnh.serverliveproperties.http.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {

    private @Id long id;
    private String name;
}

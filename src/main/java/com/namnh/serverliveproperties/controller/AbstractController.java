package com.namnh.serverliveproperties.controller;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class AbstractController<K, E> {

    private final Class<E> CLS;

    protected AbstractController(Class<E> cls, String resourceName){
        CLS = cls;
    }

    protected EntityModel<E> buildEntityModel(E e){
        return EntityModel.of(
                linkTo(methodOn(CLS).getOne())
        )
    }
}

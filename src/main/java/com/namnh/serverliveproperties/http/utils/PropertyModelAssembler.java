package com.namnh.serverliveproperties.http.utils;

import com.namnh.serverliveproperties.http.controller.PropertyController;
import com.namnh.serverliveproperties.http.entity.Property;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class PropertyModelAssembler implements RepresentationModelAssembler<Property, EntityModel<Property>> {

    @Override
    public EntityModel<Property> toModel(Property entity) {
        return EntityModel.of(
                entity,
                linkTo(methodOn(PropertyController.class).readPropertyByID(entity.getID())).withSelfRel()
        );
    }
}

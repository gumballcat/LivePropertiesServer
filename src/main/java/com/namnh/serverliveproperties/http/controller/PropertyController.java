package com.namnh.serverliveproperties.http.controller;

import com.namnh.serverliveproperties.http.entity.Property;
import com.namnh.serverliveproperties.http.repository.PropertyRepository;
import com.namnh.serverliveproperties.http.utils.PropertyModelAssembler;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PropertyController {

    private final PropertyRepository PROPERTY_REPO;
    private final PropertyModelAssembler PROPERTY_ASSEMBLER;

    PropertyController(PropertyRepository propertyRepository, PropertyModelAssembler propertyModelAssembler) {
        PROPERTY_REPO = propertyRepository;
        PROPERTY_ASSEMBLER = propertyModelAssembler;
    }

    @GetMapping(value = "/properties", produces = {"application/hal+json"})
    public CollectionModel<EntityModel<Property>> readAllProperties() {
        List<Property> list = PROPERTY_REPO.findAll();

        List<EntityModel<Property>> models = list.stream()
                .map(PROPERTY_ASSEMBLER::toModel)
                .collect(Collectors.toList());

        return CollectionModel.of(models);
    }

    @GetMapping(value = "/properties/{id}", produces = {"application/hal+json"})
    public EntityModel<Property> readPropertyByID(@PathVariable String id) {
        Property property = PROPERTY_REPO.findById(id).get();
        return PROPERTY_ASSEMBLER.toModel(property);
    }

    @PostMapping("/properties")
    public ResponseEntity<?> createProperty(@RequestBody Property property){
        EntityModel<Property> model = PROPERTY_ASSEMBLER.toModel(PROPERTY_REPO.save(property));

        return ResponseEntity.created(model.getRequiredLink(IanaLinkRelations.SELF).toUri()).body(model);
    }
}

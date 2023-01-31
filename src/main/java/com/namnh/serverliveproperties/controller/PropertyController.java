package com.namnh.serverliveproperties.controller;

import com.namnh.serverliveproperties.entity.Property;
import com.namnh.serverliveproperties.entity.PropertyGroup;
import com.namnh.serverliveproperties.entity.PropertyGroupMapping;
import com.namnh.serverliveproperties.repository.PropertyGroupMappingRepository;
import com.namnh.serverliveproperties.repository.PropertyGroupRepository;
import com.namnh.serverliveproperties.repository.PropertyRepository;
import com.namnh.serverliveproperties.utils.CollectionUtils;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class PropertyController {

    private final PropertyRepository PROPERTY_REPOSITORY;
    private final PropertyGroupRepository PROPERTY_GROUP_REPOSITORY;
    private final PropertyGroupMappingRepository PROPERTY_GROUP_MAPPING_REPOSITORY;

    PropertyController(PropertyRepository propertyRepository, PropertyGroupRepository propertyGroupRepository, PropertyGroupMappingRepository propertyGroupMappingRepository) {
        PROPERTY_REPOSITORY = propertyRepository;
        PROPERTY_GROUP_REPOSITORY = propertyGroupRepository;
        PROPERTY_GROUP_MAPPING_REPOSITORY = propertyGroupMappingRepository;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Property
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @GetMapping("/properties")
    public Collection<Property> getAllProperties() {
        return PROPERTY_REPOSITORY.findAll();
    }

    @GetMapping("/properties/{id}")
    public EntityModel<Property> getProperty(@PathVariable long id) {
        return _buildEntityModel(PROPERTY_REPOSITORY.findById(id).orElse(Property.EMPTY));
    }

    @PostMapping("/properties")
    public EntityModel<Property> createProperty(@RequestBody Property property) {
        return _buildEntityModel(PROPERTY_REPOSITORY.save(property));
    }

    @PutMapping("/properties/{id}")
    public Property updateProperty(@RequestBody Property property, @PathVariable long id) {
        Property inProperty = PROPERTY_REPOSITORY.findById(id).orElse(Property.EMPTY);
        if (Property.EMPTY.equals(inProperty)) {
            return Property.EMPTY;
        }

        inProperty.setName(property.getName());
        inProperty.setVal(property.getVal());

        return PROPERTY_REPOSITORY.save(inProperty);
    }

    @DeleteMapping("/properties/{id}")
    public void deleteProperty(@PathVariable long id) {
        PROPERTY_REPOSITORY.deleteById(id);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Property Group
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @GetMapping("/property-groups")
    public List<PropertyGroup> getAllPropertyGroups() {
        return PROPERTY_GROUP_REPOSITORY.findAll();
    }

    @GetMapping("/property-groups/{id}")
    public PropertyGroup getPropertyGroup(@PathVariable long id) {
        return PROPERTY_GROUP_REPOSITORY.findById(id).orElse(PropertyGroup.EMPTY);
    }

    @GetMapping("/property-groups/{id}/properties")
    public List<Property> getAllPropertiesOfGroup(@PathVariable("id") long propertyGroupID) {
        List<PropertyGroupMapping> propertyGroupMappings = PROPERTY_GROUP_MAPPING_REPOSITORY.findByPropertyGroupID(propertyGroupID);
        if (CollectionUtils.isEmpty(propertyGroupMappings)) {
            return Collections.emptyList();
        }

        List<Long> propertyIDs = new LinkedList<>();
        for (PropertyGroupMapping propertyGroupMapping : propertyGroupMappings) {
            propertyIDs.add(propertyGroupMapping.getPropertyID());
        }

        return PROPERTY_REPOSITORY.findAllById(propertyIDs);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Property Group Mapping
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @GetMapping("/property-group-mappings")
    public List<PropertyGroupMapping> getAllPropertyMappings() {
        return PROPERTY_GROUP_MAPPING_REPOSITORY.findAll();
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Private
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    private Link getSelfRel(Property property){
        return methodOn(this.getClass()).getProperty(1);
        return linkTo(methodOn(this.getClass()).getProperty(property.getId())).withSelfRel();
    }

    private Link getAllRel(){
        return linkTo(methodOn(this.getClass()).getAllProperties()).withRel("all");
    }

    private EntityModel<Property> _buildEntityModel(Property property) {
        return EntityModel.of(
                property,
                linkTo(methodOn(this.getClass()).getProperty(property.getId())).withSelfRel(),
                linkTo(methodOn(this.getClass()).getAllProperties()).withRel("all")
        );
    }
}

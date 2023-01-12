package com.namnh.serverliveproperties.repository;

import com.namnh.serverliveproperties.entity.PropertyGroupMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyGroupMappingRepository extends JpaRepository<PropertyGroupMapping, PropertyGroupMapping.PropertyGroupMappingID> {

    List<PropertyGroupMapping> findByPropertyGroupID(long propertyGroupID);
}

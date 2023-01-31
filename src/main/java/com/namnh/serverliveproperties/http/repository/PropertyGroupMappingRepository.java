package com.namnh.serverliveproperties.http.repository;

import com.namnh.serverliveproperties.http.entity.PropertyGroupMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyGroupMappingRepository extends JpaRepository<PropertyGroupMapping, PropertyGroupMapping.PropertyGroupMappingID> {

    List<PropertyGroupMapping> findByPropertyGroupID(long propertyGroupID);
}

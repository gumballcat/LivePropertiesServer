package com.namnh.serverliveproperties.repository;

import com.namnh.serverliveproperties.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}

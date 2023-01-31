package com.namnh.serverliveproperties.http.repository;

import com.namnh.serverliveproperties.http.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}

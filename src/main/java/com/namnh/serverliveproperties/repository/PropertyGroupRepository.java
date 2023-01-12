package com.namnh.serverliveproperties.repository;

import com.namnh.serverliveproperties.entity.PropertyGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PropertyGroupRepository extends JpaRepository<PropertyGroup, Long>, QueryByExampleExecutor<PropertyGroup> {
}

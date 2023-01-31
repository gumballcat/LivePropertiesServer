package com.namnh.serverliveproperties.http.repository;

import com.namnh.serverliveproperties.http.entity.PropertyGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PropertyGroupRepository extends JpaRepository<PropertyGroup, Long>, QueryByExampleExecutor<PropertyGroup> {
}

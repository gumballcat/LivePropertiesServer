package com.namnh.serverliveproperties.http.repository;

import com.namnh.serverliveproperties.http.entity.Property;
import com.namnh.serverliveproperties.http.entity.PropertyGroup;
import com.namnh.serverliveproperties.http.entity.PropertyGroupMapping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseLoader {

    @Bean
    CommandLineRunner load(PropertyRepository propertyRepo, PropertyGroupRepository propertyGroupRepo, PropertyGroupMappingRepository propertyGroupMappingRepo) {
        return args -> {
            propertyRepo.save(new Property("timeout", "2000"));
            propertyRepo.save(new Property("url", "localhost/8081"));
            propertyRepo.save(new Property("callback-url", "localhost/8082"));

            propertyGroupRepo.save(new PropertyGroup("User Management"));
            propertyGroupRepo.save(new PropertyGroup("Content Management"));

            propertyGroupMappingRepo.save(new PropertyGroupMapping(1, 1));
            propertyGroupMappingRepo.save(new PropertyGroupMapping(1, 2));
            propertyGroupMappingRepo.save(new PropertyGroupMapping(2, 2));
            propertyGroupMappingRepo.save(new PropertyGroupMapping(2, 3));
        };
    }
}

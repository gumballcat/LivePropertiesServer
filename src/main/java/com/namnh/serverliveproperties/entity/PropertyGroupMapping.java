package com.namnh.serverliveproperties.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "property_group_mapping")
@IdClass(PropertyGroupMapping.PropertyGroupMappingID.class)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PropertyGroupMapping {

    private @Id
    @Column(name = "property_group_id") long propertyGroupID;
    private @Id
    @Column(name = "property_id") long propertyID;

    @Getter
    public static class PropertyGroupMappingID {
        private long propertyGroupID;
        private long propertyID;
    }
}

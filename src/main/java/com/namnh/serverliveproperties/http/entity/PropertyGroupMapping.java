package com.namnh.serverliveproperties.http.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "property_group_mapping")
@IdClass(PropertyGroupMapping.PropertyGroupMappingID.class)
@ToString
@Getter
@Setter
@NoArgsConstructor
public class PropertyGroupMapping {

    private @Id
    @Column(name = "property_group_id") long propertyGroupID;
    private @Id
    @Column(name = "property_id") long propertyID;

    public PropertyGroupMapping(long pgID, long pID) {
        this.propertyGroupID = pgID;
        this.propertyID = pID;
    }

    @Getter
    public static class PropertyGroupMappingID {
        private long propertyGroupID;
        private long propertyID;
    }
}

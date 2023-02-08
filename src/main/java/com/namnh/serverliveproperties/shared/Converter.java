package com.namnh.serverliveproperties.shared;

import com.namnh.serverliveproperties.grpc.proto.GProperty;
import com.namnh.serverliveproperties.http.entity.Property;

public class Converter {

    public static GProperty httpToProtobuf(Property property) {
        return GProperty.newBuilder()
                .setId(property.getID())
                .setName(property.getName())
                .setValue(property.getVal())
                .build();
    }
}

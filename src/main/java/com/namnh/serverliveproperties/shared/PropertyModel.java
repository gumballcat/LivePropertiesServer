package com.namnh.serverliveproperties.shared;

import com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyResponseOrBuilder;
import com.namnh.serverliveproperties.http.repository.PropertyRepository;

public class PropertyModel {

    private final PropertyRepository PROPERTY_REPO;

    @Injec
    private PropertyModel(PropertyRepository propertyRepo) {
        PROPERTY_REPO = propertyRepo;
    }

    public GetPropertyResponse get(GetPropertyRequest request) {
        GetPropertyResponseOrBuilder response = GetPropertyResponse.newBuilder();
    }
}

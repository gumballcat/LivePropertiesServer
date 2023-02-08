package com.namnh.serverliveproperties.grpc.model;

import com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse;
import com.namnh.serverliveproperties.http.entity.Property;
import com.namnh.serverliveproperties.http.repository.PropertyRepository;
import com.namnh.serverliveproperties.shared.Converter;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PropertyModel {

    @Inject
    private PropertyRepository PROPERTY_REPO;


    public GetPropertyResponse get(GetPropertyRequest request) {
        GetPropertyResponse.Builder response = GetPropertyResponse.newBuilder();

        Property property = PROPERTY_REPO.findByName(request.getPropertyName());

        return response.setError(0).setPayload(Converter.httpToProtobuf(property)).build();
    }
}

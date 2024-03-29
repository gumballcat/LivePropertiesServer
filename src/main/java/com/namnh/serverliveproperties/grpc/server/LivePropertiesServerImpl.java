package com.namnh.serverliveproperties.grpc.server;

import com.namnh.serverliveproperties.grpc.model.PropertyModel;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse;
import com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerGrpc;
import io.grpc.stub.StreamObserver;

import javax.inject.Inject;

public class LivePropertiesServerImpl extends LivePropertiesServerGrpc.LivePropertiesServerImplBase {

    private final PropertyModel PROPERTY_MODEL;

    @Inject
    public LivePropertiesServerImpl(PropertyModel propertyModel){
        PROPERTY_MODEL = propertyModel;
    }

    @Override
    public void getProperty(GetPropertyRequest request, StreamObserver<GetPropertyResponse> observer) {
        observer.onNext(PROPERTY_MODEL.get(request));
        observer.onCompleted();
    }
}

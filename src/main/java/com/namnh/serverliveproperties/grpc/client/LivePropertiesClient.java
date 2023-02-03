package com.namnh.serverliveproperties.grpc.client;

import com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse;
import com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerGrpc;
import io.grpc.stub.StreamObserver;

public class LivePropertiesClient extends LivePropertiesServerGrpc.LivePropertiesServerImplBase {

    @Override
    public void getProperty(GetPropertyRequest request, StreamObserver<GetPropertyResponse> observer){
        observer.onNext();
    }
}

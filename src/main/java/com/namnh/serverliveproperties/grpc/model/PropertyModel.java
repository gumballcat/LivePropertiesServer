package com.namnh.serverliveproperties.grpc.model;

import com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse;

public class PropertyModel {

    public static final PropertyModel INST = new PropertyModel();

    private PropertyModel(){

    }

    public GetPropertyResponse get(GetPropertyRequest request){

    }
}

package com.namnh.serverliveproperties.test;

import com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest;
import com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse;
import com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class GRPCClientTest {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090).usePlaintext().build();
        LivePropertiesServerGrpc.LivePropertiesServerBlockingStub blockingStub = LivePropertiesServerGrpc.newBlockingStub(channel);

        try {
            GetPropertyResponse response = blockingStub.getProperty(GetPropertyRequest.newBuilder().setPropertyName("timeout").build());
            System.out.println(response);
        } catch (StatusRuntimeException e) {
            e.printStackTrace(System.err);
        }
    }
}

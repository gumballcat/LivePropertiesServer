package com.namnh.serverliveproperties.grpc.server;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LivePropertiesServer {

    private final Server SERVER;

    public LivePropertiesServer(int port) {
        SERVER = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create()).addService(new LivePropertiesServerImpl()).build();
    }

    public void start() throws IOException {
        SERVER.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println(" *** Shutting down gRPC server since JVM is shutting down");
            try {
                LivePropertiesServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }));
    }

    public void stop() throws InterruptedException {
        if (SERVER != null) {
            SERVER.shutdown().awaitTermination(10, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (SERVER != null) {
            SERVER.awaitTermination();
        }
    }
}

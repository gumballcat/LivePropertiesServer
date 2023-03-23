package com.namnh.serverliveproperties.test;

import com.namnh.serverliveproperties.grpc.server.LivePropertiesServer;

import java.io.IOException;

public class GRPCServerTest {

    public static void main(String[] args) throws InterruptedException, IOException {
        LivePropertiesServer server = new LivePropertiesServer(8090);
        server.start();
        server.blockUntilShutdown();
    }
}

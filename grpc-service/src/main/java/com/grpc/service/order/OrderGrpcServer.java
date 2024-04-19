package com.grpc.service.order;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.SneakyThrows;

/**
 * @author: luxs
 * @date: 19/04/2024
 */
public class OrderGrpcServer {
    @SneakyThrows
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(9999)
                .addService(new OrderQueryServiceImpl())
                .build()
                .start();
        System.out.println("server start --- ");
        server.awaitTermination();
    }
}

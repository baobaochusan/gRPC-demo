package com.grpc.client.order;

import com.grpc.api.proto.order.Buyer;
import com.grpc.api.proto.order.OrderQueryServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author: luxs
 * @date: 19/04/2024
 */
public class OrderGrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9999)
                .usePlaintext()
                .build();
        try {
            OrderQueryServiceGrpc.OrderQueryServiceBlockingStub stub = OrderQueryServiceGrpc.newBlockingStub(channel);
            Buyer buyer = Buyer.newBuilder().setBuyerId(10086).build();
            stub.listOrders(buyer).forEachRemaining(System.out::println);
        }finally {
            channel.shutdown();
        }
    }
}

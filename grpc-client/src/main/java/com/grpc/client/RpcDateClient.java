package com.grpc.client;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.grpc.api.proto.RPCDateRequest;
import com.grpc.api.proto.RPCDateResponse;
import com.grpc.api.proto.RPCDateServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.SneakyThrows;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: luxs
 * @date: 19/04/2024
 */
public class RpcDateClient  implements Runnable {

   static AtomicInteger counter = new AtomicInteger(1);

    /**
     * 主函数：通过 gRPC 客户端向服务器请求当前日期。
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 100,
                10L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100),
                new ThreadPoolExecutor.DiscardPolicy());

        while (true){
            executor.execute(new RpcDateClient());
        }

    }

    @SneakyThrows
    @Override
    public void run() {
        // 创建一个连接到本地主机的 gRPC 通道，使用明文传输
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();
        try {
            // 创建一个同步阻塞式的客户端存根，用于与服务器交互
            RPCDateServiceGrpc.RPCDateServiceFutureStub clientStub = RPCDateServiceGrpc.newFutureStub(channel);
            // 向服务器发送请求，获取当前日期，请求中包含用户名 "luxs"
            ListenableFuture<RPCDateResponse> future = clientStub.getDate(RPCDateRequest.newBuilder().setUserName("luxs : " + counter.getAndIncrement()).build());
            // 打印服务器返回的日期
            System.out.println(future.get().getServerDate());
        } finally {
            // 关闭通道，释放资源
            channel.shutdown();
        }

    }
}

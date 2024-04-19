package com.grpc.service;

import com.grpc.api.proto.RPCDateRequest;
import com.grpc.api.proto.RPCDateResponse;
import com.grpc.api.proto.RPCDateServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.Data;
import lombok.SneakyThrows;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * @author: luxs
 * @date: 19/04/2024
 */
@Data
public class RpcDateServiceImpl extends RPCDateServiceGrpc.RPCDateServiceImplBase {

    final String template = "你好:%s,当前时间是:%s!";

    /**
     * 获取服务器当前日期并响应给请求者。
     *
     * @param request          包含用户名称的RPCDateRequest对象。
     * @param responseObserver 用于接收RPC响应的StreamObserver对象。
     */
    @Override
    public void getDate(RPCDateRequest request, StreamObserver<RPCDateResponse> responseObserver) {
        // 从请求中提取用户名
        String userName = request.getUserName();
        // 生成包含用户名和当前时间的日期字符串
        String serverDate = String.format(template, userName, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        // 构建RPC日期响应对象
        RPCDateResponse response = RPCDateResponse.newBuilder().setServerDate(serverDate).build();
        // 向观察者发送响应
        responseObserver.onNext(response);
        // 通知观察者处理完成
        responseObserver.onCompleted();
    }

    @SneakyThrows
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8888).addService(new RpcDateServiceImpl()).build();
        server.start();
        System.out.println("服务已启动，等待客户端连接...");
        server.awaitTermination();
    }

}

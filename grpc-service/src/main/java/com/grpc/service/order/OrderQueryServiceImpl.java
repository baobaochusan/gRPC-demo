package com.grpc.service.order;

import com.grpc.api.proto.order.Buyer;
import com.grpc.api.proto.order.Order;
import com.grpc.api.proto.order.OrderQueryServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: luxs
 * @date: 19/04/2024
 */
public class OrderQueryServiceImpl extends OrderQueryServiceGrpc.OrderQueryServiceImplBase {

    /**
     * 假设Order类和Builder模式的实现是线程安全的，或者这个方法仅在单线程环境下使用
     *
     * @return
     */
    private static List<Order> mockOrder() {
        // 创建单个Builder实例用于构建所有订单
        Order.Builder sharedBuilder = Order.newBuilder();
        return IntStream.range(1, 50).mapToObj(i -> buildOrder(sharedBuilder, i))
                .collect(Collectors.toList());
    }

    /**
     * 使用单独的方法为每个订单设置属性并构建，以提高代码的可维护性
     *
     * @param builder
     * @param index
     * @return
     */
    private static Order buildOrder(Order.Builder builder, int index) {
        // 保证每次调用buildOrder时，都通过新的Builder实例来避免状态共享
        builder = builder.clone();
        return builder.setOrderId(index)
                .setBuyerRemark("remark - " + index)
                .setOrderTime(System.currentTimeMillis() / 1000)
                .setProductId(1000 + index)
                .build();
    }

    @Override
    public void listOrders(Buyer request, StreamObserver<Order> responseObserver) {
        //服务端流式
        mockOrder().forEach(order -> responseObserver.onNext(order));
        responseObserver.onCompleted();
    }

}

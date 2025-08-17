package com.spring.microservices.order_service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.microservices.order_service.Repository.OrderRepository;
import com.spring.microservices.order_service.dto.OrderRequest;
import com.spring.microservices.order_service.model.Order;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);
    }

}
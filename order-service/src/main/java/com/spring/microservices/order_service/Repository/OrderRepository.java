package com.spring.microservices.order_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.microservices.order_service.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

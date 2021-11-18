package com.example.demo.dal;

import com.example.demo.model.Order;

public interface OrderRepository {

    Order save(Order order);
}

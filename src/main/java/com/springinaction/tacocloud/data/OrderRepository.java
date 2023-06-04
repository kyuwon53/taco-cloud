package com.springinaction.tacocloud.data;

import com.springinaction.tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}

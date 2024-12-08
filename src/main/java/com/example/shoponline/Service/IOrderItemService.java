package com.example.shoponline.Service;

import com.example.shoponline.model.OrderItem;

import java.util.List;

public interface IOrderItemService {
    public List<OrderItem> getAllOrderItems();
    public OrderItem getOrderItemById(Long id);
    public OrderItem saveOrderItem(OrderItem orderItem);
    public void deleteOrderItem(OrderItem orderItem);
    public void updateOrderItem(OrderItem orderItem);
}

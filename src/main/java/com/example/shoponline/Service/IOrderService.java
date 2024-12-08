package com.example.shoponline.Service;

import com.example.shoponline.model.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> getAllOrders();
    public Order getOrderById(Long id);
    public Order saveOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrder(Long id);

}

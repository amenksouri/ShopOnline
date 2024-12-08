package com.example.shoponline.Service.implementation;

import com.example.shoponline.Service.IOrderItemService;
import com.example.shoponline.model.Categorie;
import com.example.shoponline.model.OrderItem;
import com.example.shoponline.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemImplementation implements IOrderItemService {

    @Autowired
    OrderItemRepository orderItemRepo;

    @Override
    public List<OrderItem> getAllOrderItems() {
        return (List<OrderItem>) orderItemRepo.findAll();
    }

    @Override
    public OrderItem getOrderItemById(Long id) {
        Optional<OrderItem> op = orderItemRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("OrderItem avec l'Id "+ id +"n'existe pas");
        }
    }

    @Override
    public OrderItem saveOrderItem(OrderItem orderItem) {
        return orderItemRepo.save(orderItem);
    }

    @Override
    public void deleteOrderItem(OrderItem orderItem) {
        orderItemRepo.delete(orderItem);
    }

    @Override
    public void updateOrderItem(OrderItem orderItem) {
        orderItemRepo.save(orderItem);
    }
}

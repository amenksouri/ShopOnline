package com.example.shoponline.Service.implementation;

import com.example.shoponline.Service.IOrderService;
import com.example.shoponline.model.Order;
import com.example.shoponline.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderImplementation implements IOrderService {
    @Autowired
    private OrderRepository orderRepo;

    @Override
    public List<Order> getAllOrders() {
        return (List<Order>) orderRepo.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        Optional<Order> op = orderRepo.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        else
        {
            throw new NullPointerException("Order avec l'Id "+ id +"n'existe pas");
        }
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public void updateOrder(Order order) {
        orderRepo.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}

package com.example.shoponline.repository;

import com.example.shoponline.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}

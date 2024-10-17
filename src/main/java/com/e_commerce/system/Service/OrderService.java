package com.e_commerce.system.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.system.Entity.Order;
import com.e_commerce.system.Entity.OrderRequest;
import com.e_commerce.system.Entity.Product;
import com.e_commerce.system.Entity.User;
import com.e_commerce.system.Repository.OrderRepository;
import com.e_commerce.system.Repository.ProductRepository;
import com.e_commerce.system.Repository.UserRepository;

@Service
public class OrderService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(OrderRequest orderRequest) {
        User user = userRepository.findById(orderRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<Product> products = productRepository.findAllById(orderRequest.getProductIds());
        if (products.isEmpty()) {
            throw new RuntimeException("No products found for the given IDs");
        }

        Order order = new Order();
        order.setUser(user);
        order.setProducts(products);
        order.setPaymentMethod(orderRequest.getPaymentMethod());
        order.setStatus("PENDING");

        return orderRepository.save(order);
    }
}

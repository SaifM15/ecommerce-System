package com.e_commerce.system.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.e_commerce.system.Entity.Order;
import com.e_commerce.system.Entity.Payment;
import com.e_commerce.system.Repository.OrderRepository;
import com.e_commerce.system.Repository.PaymentRepository;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderRepository orderRepository;

    public Payment processPayment(Long orderId, double amount, String method) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        
        Payment payment = new Payment();
        payment.setOrder(order);
        payment.setAmount(amount);
        payment.setPaymentMethod(method);
        
        order.setStatus("COMPLETED");
        orderRepository.save(order); // Save updated order status
        
        return paymentRepository.save(payment);
    }
}

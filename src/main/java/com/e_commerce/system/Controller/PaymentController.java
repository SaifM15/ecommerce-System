package com.e_commerce.system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.e_commerce.system.Entity.Payment;
import com.e_commerce.system.Service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public Payment processPayment(@RequestParam Long orderId, @RequestParam double amount, @RequestParam String method) {
        return paymentService.processPayment(orderId, amount, method);
    }
}

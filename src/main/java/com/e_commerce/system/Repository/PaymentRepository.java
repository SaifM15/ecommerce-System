package com.e_commerce.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_commerce.system.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {}

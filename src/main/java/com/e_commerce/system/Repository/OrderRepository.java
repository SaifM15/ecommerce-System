	package com.e_commerce.system.Repository;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	
	import com.e_commerce.system.Entity.Order;
	
	public interface OrderRepository extends JpaRepository<Order, Long> {}

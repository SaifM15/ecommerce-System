package com.e_commerce.system.Entity;

import java.util.List;

public class OrderRequest {
    private Long userId;
    private List<Long> productIds;
    private String paymentMethod;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<Long> getProductIds() {
		return productIds;
	}
	public void setProductIds(List<Long> productIds) {
		this.productIds = productIds;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	@Override
	public String toString() {
		return "OrderRequest [userId=" + userId + ", productIds=" + productIds + ", paymentMethod=" + paymentMethod
				+ "]";
	}
	public OrderRequest(Long userId, List<Long> productIds, String paymentMethod) {
		super();
		this.userId = userId;
		this.productIds = productIds;
		this.paymentMethod = paymentMethod;
	}
	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Getters and Setters
}

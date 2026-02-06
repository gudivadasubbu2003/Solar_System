package com.solarsystem.solar_platform.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderid;
	
	@Column(name="QuoteRequestid",nullable=false)
	private int QuoteRequestId;


	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	private LocalDateTime createdAt;
	

    public long getOrderid() {
		return orderid;
	}


	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}


	public int getQuoteRequestId() {
		return QuoteRequestId;
	}


	public void setQuoteRequestId(int quoteRequestId) {
		QuoteRequestId = quoteRequestId;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
	
	
}

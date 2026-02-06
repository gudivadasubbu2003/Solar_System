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
@Table(name = "quote_requests")
public class QuoteRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long QuoteRequestid;

	@Column(name="customer_id",nullable=false)
	private Long customerId;

	@Column(name="SolarModelId",nullable=false)
	private Long SolarModelId;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	QuoteRequestStatus status;

	private String customconfig;

	private LocalDateTime createdAt;

	public Long getId() {
		return QuoteRequestid;
	}

	public void setId(Long QuoteRequestid) {
		this.QuoteRequestid = QuoteRequestid;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getSolarModelId() {
		return SolarModelId;
	}

	public void setSolarModelId(Long solarModelId) {
		SolarModelId = solarModelId;
	}

	public QuoteRequestStatus getStatus() {
		return status;
	}

	public void setStatus(QuoteRequestStatus status) {
		this.status = status;
	}

	public String getCustomconfig() {
		return customconfig;
	}

	public void setCustomconfig(String customconfig) {
		this.customconfig = customconfig;
	}

	@PrePersist
	protected void onCreate() {
		this.setCreatedAt(LocalDateTime.now());
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}

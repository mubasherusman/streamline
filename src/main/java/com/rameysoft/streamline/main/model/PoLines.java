package com.rameysoft.streamline.main.model;

// Generated Jun 28, 2015 9:47:25 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PoLines generated by hbm2java
 */
@Entity
@Table(name = "po_lines")
public class PoLines implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Products products;
	private PurchaseOrder purchaseOrder;
	private Integer quantity;
	private Double unitPrice;

	public PoLines() {
	}

	public PoLines(Products products, PurchaseOrder purchaseOrder) {
		this.products = products;
		this.purchaseOrder = purchaseOrder;
	}

	public PoLines(Products products, PurchaseOrder purchaseOrder,
			Integer quantity, Double unitPrice) {
		this.products = products;
		this.purchaseOrder = purchaseOrder;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name = "products_id", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name = "purchase_order_id", nullable = false)
	public PurchaseOrder getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "unit_price", precision = 22, scale = 0)
	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
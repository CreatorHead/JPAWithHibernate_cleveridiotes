package com.dev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products_info")
public class Products {
	private String name;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private Integer productId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Products [name=" + name + ", productId=" + productId + "]";
	}
}

package com.dev.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="customer_info")
public class Customer {
	
	private String name;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id")
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addrs_id", referencedColumnName="addrs_id")
	private Address address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id",nullable=false)
	private List<Products> products;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", address=" + address + ", products=" + products + "]";
	}
	
}

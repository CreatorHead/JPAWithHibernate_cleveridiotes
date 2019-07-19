package com.dev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dogs_info")
public class Dog {
	@Id 
	@Column(name="dog_id") 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer dogId;
	private String name;
	private String color;
	private String breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Integer getDogId() {
		return dogId;
	}
	public void setDogId(Integer dogId) {
		this.dogId = dogId;
	}
	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", name=" + name + ", color=" + color + ", breed=" + breed + "]";
	}
}

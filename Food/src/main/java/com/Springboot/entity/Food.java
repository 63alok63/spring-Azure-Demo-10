package com.Springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Food {
	@Id
	int sno;
	String Food_name;
	int Price;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getFood_name() {
		return Food_name;
	}
	public void setFood_name(String food_name) {
		Food_name = food_name;
	}
	public int getPrice() {
		return Price;
	}
	
	public void setPrice(int price) {
		Price = price;
	}
	
	}
	



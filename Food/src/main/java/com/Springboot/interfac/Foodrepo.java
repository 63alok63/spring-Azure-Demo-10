package com.Springboot.interfac;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.entity.Food;



public interface Foodrepo extends JpaRepository<Food, Integer> {

	 


}

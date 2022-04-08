package com.Springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.entity.Food;
import com.Springboot.interfac.Foodrepo;

@RestController
public class MyController {
	@Autowired
	Foodrepo repo;

	@GetMapping("/")
	public String home() {
		return "hello";
	}

	@GetMapping("/food")
	public List<Food> getFood() {
		return repo.findAll();
	}

	@PostMapping("/food")
	public Food addFood(@RequestBody Food foods) {
		return repo.save(foods);
	}

	@DeleteMapping("/food/{sno}")
	// delete the course
	public ResponseEntity<HttpStatus> deleteFood(@PathVariable Food sno) {
		try {
			this.repo.delete(sno);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}

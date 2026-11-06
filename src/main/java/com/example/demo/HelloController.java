package com.example.demo;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@PostMapping("/persons")
	public void create(@Parameter(in = ParameterIn.QUERY) Long id, @RequestBody Person person) {
	}

	@GetMapping("/persons/{id}")
	public Person get(@PathVariable Long id) {
		return new Person(id, "Jane");
	}

	public record Person(Long id, String name) {
	}

}

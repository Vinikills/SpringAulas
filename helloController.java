package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")//informar o endereço da web

public class helloController {
	@GetMapping//pega informação do método e exibe
	public String hello() {
		return "Hello World! Seja bem vindo ao Spring!";
		
	}
}
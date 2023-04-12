package org.generation.helloworld.controller;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController

	@RequestMapping("/hello")
	public class HelloController {
		
		@GetMapping
		public String hello() {
			return "Alo Mundo";
		}
		
		@GetMapping("/bsm")
		public String bsm() {
			return "Persistencia , Foco é AutoMotivação para chegar nos meus objetivos";
		}
		
		@GetMapping("/Planos")
		public String Planos() {
			return "+ Continuar Praticando o que aprendi no primeiro bloco \n"
				+  "+ Planeja minha rotina do dia seguinde de forma organizada \n"
				+  "+ Continuar minha rotinas de exercicos fisicos é meditação \n"
				+  "+ Exercitar a mente com pequenos estimulo de percistencia \n";
		}
		
		

	}


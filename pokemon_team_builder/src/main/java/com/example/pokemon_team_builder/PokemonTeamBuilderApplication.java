package com.example.pokemon_team_builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PokemonTeamBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonTeamBuilderApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld() {
		return "Loaded!";
	}

}

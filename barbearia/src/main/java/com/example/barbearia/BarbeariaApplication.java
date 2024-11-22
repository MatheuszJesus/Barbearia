package com.example.barbearia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.barbearia.model.Usuario;
import com.example.barbearia.repository.IUsuarioRepository;

@SpringBootApplication
public class BarbeariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbeariaApplication.class, args);
	}

	public CommandLineRunner demo (IUsuarioRepository usuRep){
		return(args) ->{
			Usuario u = new Usuario();
			u.setNome("matheus");
			usuRep.save(u);

			
		};
	}
}

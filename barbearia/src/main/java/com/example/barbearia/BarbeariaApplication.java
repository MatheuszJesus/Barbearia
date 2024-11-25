package com.example.barbearia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.barbearia.model.*;
import com.example.barbearia.service.ClienteService;
import java.time.LocalDate;


@SpringBootApplication
public class BarbeariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbeariaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo (ClienteService cli){
		return(args) ->{

			Cliente c = new Cliente();
			c.setNome("matheus");
			c.setEmail("matheus@gmail");
			c.setCpf("999-999-999");
			LocalDate data = LocalDate.of(2000, 12, 12);
			c.setDataCadastro(data);
			LocalDate data2 = LocalDate.of(2000, 11, 12);
			c.setDataNasc(data2);
			c.setTelefone("999999-999");
			c.setSenha("askdasda");
			cli.salvar(c);
			System.out.println(cli.buscarTodas());
		};
	}
}

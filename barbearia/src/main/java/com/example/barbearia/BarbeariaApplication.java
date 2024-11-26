package com.example.barbearia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.barbearia.model.*;
import com.example.barbearia.service.AgendaService;
import com.example.barbearia.service.ClienteService;
import com.example.barbearia.service.FuncionarioService;
import com.example.barbearia.service.ServicoService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BarbeariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbeariaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo (ClienteService cli, ServicoService serv, FuncionarioService func, AgendaService agend){
		return(args) ->{

			Cliente c = new Cliente();
			c.setNome("matheus");
			c.setEmail("matheus@gmail");
			c.setCpf("999.999.999-99");
			c.setDataCadastro(LocalDate.now());
			c.setDataNasc(LocalDate.of(2006, 9, 19));
			c.setTelefone("(77) 99999-9999");
			c.setSenha("askdasda");
			cli.salvar(c);
			// System.out.println(cli.buscarTodos());

			Funcionario f = new Funcionario();
			f.setNome("Eduardo");
			f.setCpf("888.888.888-88");
			f.setDataNasc(LocalDate.of(2000, 6, 12));
			f.setDataCadastro(LocalDate.now());
			f.setTelefone("(77) 97777-7777");
			f.setCargo("Cabeleleiro");
			f.setEmail("eduardo@gmail.com");
			f.setSalario(new BigDecimal("1200.00"));
			f.setSenha("eseseses");
			func.salvar(f);
			// System.out.println(func.buscarTodos());

			Servico s = new Servico();
			s.setCategoria("corte + barba");
			s.setDescricao("dsadasdasdasdadsasda");
			s.setPreco(new BigDecimal("40.00"));
			serv.salvar(s);
			// System.out.println(serv.buscarTodos());

			Servico s1 = new Servico();
			s1.setCategoria("luzes");
			s1.setDescricao("dsadasdasdasdsadsasadsasda");
			s1.setPreco(new BigDecimal("50.00"));
			serv.salvar(s1);
			// System.out.println(serv.buscarTodos());


			List<Servico> listaServicos = new ArrayList<>();
			listaServicos.add(s);
			listaServicos.add(s1);
			Agenda a = new Agenda();
			a.setCliente(c);
			a.setFuncionario(f);
			a.setData(LocalDate.of(2024, 11, 27));
			a.setHora(LocalTime.of(16, 30));
			a.setServico(listaServicos);
			agend.salvar(a);
			// System.out.println(agend.buscarTodas());
			
			
		};
	}
}

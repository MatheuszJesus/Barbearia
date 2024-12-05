package com.example.barbearia;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.barbearia.model.Agenda;
import com.example.barbearia.model.Cliente;
import com.example.barbearia.model.Funcionario;
import com.example.barbearia.model.Pagamento;
import com.example.barbearia.model.Servico;
import com.example.barbearia.service.AgendaService;
import com.example.barbearia.service.ClienteService;
import com.example.barbearia.service.FuncionarioService;
import com.example.barbearia.service.PagamentoService;
import com.example.barbearia.service.ServicoService;



@SpringBootApplication
public class BarbeariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbeariaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo (ClienteService cli, ServicoService serv, FuncionarioService func, AgendaService agend, PagamentoService pag){
		return(args) ->{

			Cliente c = new Cliente();
			c.setNome("matheus");
			c.setEmail("matheus@gmail");
			c.setCpf("999.999.999-99");
			c.setDataCadastro(LocalDate.now());
			c.setDataNasc(LocalDate.of(2006, 9, 19));
			c.setTelefone("(77) 99999-9999");
			c.setSenha("mths789#2");

			cli.salvar(c);

			System.out.println(cli.buscarTodos());
		

			Funcionario f = new Funcionario();
			f.setNome("Eduardo");
			f.setCpf("888.888.888-88");
			f.setDataNasc(LocalDate.of(2000, 6, 12));
			f.setDataCadastro(LocalDate.now());
			f.setTelefone("(77) 97777-7777");
			f.setCargo("Cabeleleiro");
			f.setEmail("eduardo@gmail.com");
			f.setSalario(new BigDecimal("1200.00"));
			f.setSenha("edd999#");
			func.salvar(f);
			System.out.println(func.buscarTodos());

			Servico s = new Servico();
			s.setCategoria("corte");
			s.setDescricao("Corte de cabelo a partir da escolha do cliente. ");
			s.setPreco(new BigDecimal("25.00"));
			serv.salvar(s);
			System.out.println(serv.buscarTodos());

			Servico s1 = new Servico();
			s1.setCategoria("luzes");
			s1.setDescricao("Aquele cabelo no estilo mais chamativo e diferenciado possível.");
			s1.setPreco(new BigDecimal("80.00"));
			serv.salvar(s1);
			System.out.println(serv.buscarTodos());

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
			System.out.println(agend.buscarTodas());
			
			Pagamento p = new Pagamento();
			p.setCliente(c);
			p.setDataPagamento(LocalDate.now());
			p.setStatus("Confirmado");
			p.setFormaPagamento("Pix");
			p.setValor(new BigDecimal("90.00"));
			p.setAtendimento(a);
			pag.salvar(p);
			System.out.println(pag.buscarTodos());
		};
	}
}

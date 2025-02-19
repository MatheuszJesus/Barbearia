package com.example.barbearia.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.barbearia.model.Funcionario;
import com.example.barbearia.service.FuncionarioService;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope("view")
public class CadastroFuncionarioBean {
    @Getter @Setter
    private Funcionario funcionario = new Funcionario();
    
    @Autowired
    private FuncionarioService funcionarioService;
    
    public void salvar() {
        FacesContext context = FacesContext.getCurrentInstance();
        funcionarioService.salvar(funcionario);
        funcionario = new Funcionario();
        
        FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro efetuado.",
                "Funcionário cadastrado com sucesso.");
        context.addMessage(null, mensagem);
    }
    
    public void prepararCadastro() {
        funcionario = funcionarioService.buscarPorId(funcionario.getId());
    }
}

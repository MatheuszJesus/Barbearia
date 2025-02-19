package com.example.barbearia.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.barbearia.model.Cliente;
import com.example.barbearia.service.ClienteService;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope("view")
public class CadastroClienteBean {
    @Getter @Setter
    
    private Cliente cliente = new Cliente();
    
    @Autowired
    private ClienteService clienteService;
    
    public void salvar() {
        FacesContext context = FacesContext.getCurrentInstance();
        clienteService.salvar(cliente);
        cliente = new Cliente();
        
        FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro efetuado.",
                "Cliente cadastrado com sucesso.");
        context.addMessage(null, mensagem);
    }
}

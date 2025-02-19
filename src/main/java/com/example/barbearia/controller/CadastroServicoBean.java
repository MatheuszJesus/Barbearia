package com.example.barbearia.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.barbearia.model.*;
import com.example.barbearia.service.*;
import lombok.Getter;
import lombok.Setter;


@Component
@Scope("view")
public class CadastroServicoBean {
    @Getter @Setter
    private Servico servico = new Servico();
    
    @Autowired
    private ServicoService servicoService;
    
    public void salvar() {
        FacesContext context = FacesContext.getCurrentInstance();
        servicoService.salvar(servico);
        servico = new Servico();
        
        FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro efetuado.",
                "Serviço cadastrado com sucesso.");
        context.addMessage(null, mensagem);
    }
}




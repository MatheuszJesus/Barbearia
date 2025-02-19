    package com.example.barbearia.controller;

    import javax.faces.application.FacesMessage;
    import javax.faces.context.FacesContext;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.context.annotation.Scope;
    import org.springframework.stereotype.Component;

    import com.example.barbearia.model.Agenda;
    import com.example.barbearia.service.AgendaService;

    import lombok.Getter;
    import lombok.Setter;

    @Component
    @Scope("view")
    public class CadastroAgendaBean {
        @Getter @Setter
        private Agenda agenda = new Agenda();
        
        @Autowired
        private AgendaService agendaService;
        
        public void salvar() {
            FacesContext context = FacesContext.getCurrentInstance();
            agendaService.salvar(agenda);
            agenda = new Agenda();
            
            FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro efetuado.",
                    "Agendamento cadastrado com sucesso.");
            context.addMessage(null, mensagem);
        }
    }

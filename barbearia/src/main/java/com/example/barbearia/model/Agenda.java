package com.example.barbearia.model;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;

public class Agenda extends AbstractEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "id_cliente_fk")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_funcionario_fk")
    private Funcionario funcionario;
    private LocalDate data;
    private LocalTime hora;
    @OneToMany(mappedBy = "agenda")
    private Servico servico;
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public Servico getServico() {
        return servico;
    }
    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "Agenda [cliente=" + cliente + ", funcionario=" + funcionario + ", data=" + data + ", hora=" + hora
                + ", servico=" + servico + "]";
    }
}

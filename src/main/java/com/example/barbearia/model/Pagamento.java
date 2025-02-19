package com.example.barbearia.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "PAGAMENTOS")
public class Pagamento extends AbstractEntity<Long> {
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal valor;
    @Column(nullable = false, unique = true, length = 20)
    private String formaPagamento;
    @Column(name = "data_pagamento", nullable = false, columnDefinition = "DATE")
    private LocalDate dataPagamento;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "cliente_id_fk")
    private Cliente cliente;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "atendimento_id_fk")
    private Agenda atendimento;
    @Column(nullable = false, unique = true, length = 20)
    private String status;
    
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public LocalDate getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Agenda getAtendimento() {
        return atendimento;
    }
    public void setAtendimento(Agenda atendimento) {
        this.atendimento = atendimento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagamento [valor=" + valor + ", formaPagamento=" + formaPagamento + ", dataPagamento=" + dataPagamento
                + ", cliente=" + cliente + ", atendimento=" + atendimento + ", status=" + status + "]";
    }
}

package com.example.barbearia.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "SERVICOS")
public class Servico extends AbstractEntity<Long> {
    @Column(nullable = false, unique = true, length = 30)
    private String categoria;
    @Column(nullable = false, unique = true, length = 200)
    private String descricao;
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal preco;

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Servico [categoria=" + categoria + ", descricao=" + descricao + ", preco=" + preco + "]";
    }
}

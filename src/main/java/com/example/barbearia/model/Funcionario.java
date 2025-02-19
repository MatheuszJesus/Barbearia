package com.example.barbearia.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
    @Column(nullable = false, unique = false, length = 200)
    private String nome;
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    @Column(nullable = false, unique = true, length = 15)
    private String senha;
    @Column(nullable = false, unique = true, length = 20)
    private String telefone;
    @Column(nullable = false, unique = true, length = 20)
    private String cpf;
    @Column(name = "data_nasc", nullable = false, columnDefinition = "DATE")
    private LocalDate dataNasc;
    @Column(name = "data_cadastro", nullable = false, columnDefinition = "DATE")
    private LocalDate dataCadastro;
    @Column(nullable = false, unique = false, length = 30)
    private String cargo;
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone
                + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", dataCadastro=" + dataCadastro + ", cargo=" + cargo
                + ", salario=" + salario + "]";
    }
}

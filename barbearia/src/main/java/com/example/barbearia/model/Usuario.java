package com.example.barbearia.model;
import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "USUARIOS")
public class Usuario extends AbstractEntity<Long> {
    @Column(nullable = false, unique = true, length = 200)
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
    private Date dataNasc;
    @Column(name = "data_cadastro", nullable = false, columnDefinition = "DATE")
    private Date dataCadastro;

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
    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone + ", cpf="
                + cpf + ", dataNasc=" + dataNasc + ", dataCadastro=" + dataCadastro + "]";
    }
}

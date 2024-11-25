package com.example.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barbearia.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long> {
    
}

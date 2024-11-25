package com.example.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barbearia.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    
}

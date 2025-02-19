package com.example.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barbearia.model.Servico;

public interface IServicoRepository extends JpaRepository<Servico, Long> {
    
}

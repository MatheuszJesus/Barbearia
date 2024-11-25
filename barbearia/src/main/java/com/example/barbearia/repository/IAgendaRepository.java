package com.example.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barbearia.model.Agenda;

public interface IAgendaRepository extends JpaRepository<Agenda, Long> {
    
}


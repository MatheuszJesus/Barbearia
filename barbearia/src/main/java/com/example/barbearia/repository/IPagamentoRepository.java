package com.example.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barbearia.model.Pagamento;

public interface IPagamentoRepository extends JpaRepository<Pagamento, Long> {
    
}

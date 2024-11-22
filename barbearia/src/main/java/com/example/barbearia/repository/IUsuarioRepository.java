package com.example.barbearia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barbearia.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Long, Usuario> {

    void save(Usuario u);

    
}
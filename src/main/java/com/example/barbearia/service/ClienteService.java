package com.example.barbearia.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.barbearia.model.Cliente;
import com.example.barbearia.repository.IClienteRepository;

@Service
@Transactional(readOnly = false)
public class ClienteService {
    @Autowired
    private IClienteRepository repository;

    public void salvar(Cliente cliente){
        repository.save(cliente);
    }

    public void editar(Cliente cliente){
        repository.save(cliente);        
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Cliente buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos(){
        return repository.findAll();
    }
}

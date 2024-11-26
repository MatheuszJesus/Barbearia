package com.example.barbearia.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.barbearia.model.Servico;
import com.example.barbearia.repository.IServicoRepository;

@Service
@Transactional(readOnly = false)
public class ServicoService {
    @Autowired
    private IServicoRepository repository;

    public void salvar(Servico servico){
        repository.save(servico);
    }

    public void editar(Servico servico){
        repository.save(servico);        
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Servico buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Servico> buscarTodos(){
        return repository.findAll();
    }
}

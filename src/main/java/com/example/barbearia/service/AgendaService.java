package com.example.barbearia.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.barbearia.model.Agenda;
import com.example.barbearia.repository.IAgendaRepository;

@Service
@Transactional(readOnly = false)
public class AgendaService {
    @Autowired
    private IAgendaRepository repository;

    public void salvar(Agenda agenda){
        repository.save(agenda);
    }

    public void editar(Agenda agenda){
        repository.save(agenda);        
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Agenda buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Agenda> buscarTodas(){
        return repository.findAll();
    }
}

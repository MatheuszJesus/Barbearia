package com.example.barbearia.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.barbearia.model.Pagamento;
import com.example.barbearia.repository.IPagamentoRepository;

@Service
@Transactional(readOnly = false)
public class PagamentoService {
    @Autowired
    private IPagamentoRepository repository;

    public void salvar(Pagamento pagamento){
        repository.save(pagamento);
    }

    public void editar(Pagamento pagamento){
        repository.save(pagamento);        
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Pagamento buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Pagamento> buscarTodos(){
        return repository.findAll();
    }
}

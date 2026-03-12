package com.example.demo.gastospersonales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.gastospersonales.model.Gasto;
import com.example.demo.gastospersonales.repository.GastoRepository;

@Service
public class GastoService {

   @Autowired
    private GastoRepository repository;

    public List<Gasto> listar() {
        return repository.findAll();
    }

    public void guardar(Gasto gasto) {
        repository.save(gasto);
    }

    public Gasto obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }


}

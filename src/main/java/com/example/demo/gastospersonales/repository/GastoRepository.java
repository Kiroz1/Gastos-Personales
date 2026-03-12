package com.example.demo.gastospersonales.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.gastospersonales.model.Gasto;

  public interface GastoRepository extends JpaRepository<Gasto, Long> {
}


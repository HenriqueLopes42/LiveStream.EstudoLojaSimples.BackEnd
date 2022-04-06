package com.EstudoDeCasa.Estudo.repositories;

import com.EstudoDeCasa.Estudo.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Comprarepository extends JpaRepository<Compra, Integer> {
    List<Compra> findByAtivo (Boolean ativo);
}

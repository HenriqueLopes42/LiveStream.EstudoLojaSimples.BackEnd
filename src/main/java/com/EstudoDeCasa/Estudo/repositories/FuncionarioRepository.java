package com.EstudoDeCasa.Estudo.repositories;

import com.EstudoDeCasa.Estudo.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    List<Funcionario> findByAtivo (Boolean ativo);
}

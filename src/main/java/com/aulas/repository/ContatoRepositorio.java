package com.aulas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entidade.Contatos;

@Repository
public interface ContatoRepositorio extends CrudRepository<Contatos, Integer> {

}

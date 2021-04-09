package com.telefone.testesunitarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telefone.testesunitarios.model.ContatoModel;

public interface ContatoRepository  extends JpaRepository<ContatoModel, Long>{

}

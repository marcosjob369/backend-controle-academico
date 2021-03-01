package com.jobdev.controleacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobdev.controleacademico.entity.Pessoa;

public interface PessoaDao extends JpaRepository<Pessoa, Long> {

}

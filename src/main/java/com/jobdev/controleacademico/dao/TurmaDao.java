package com.jobdev.controleacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobdev.controleacademico.entity.Turma;

public interface TurmaDao extends JpaRepository<Turma, Long> {

}

package com.jobdev.controleacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobdev.controleacademico.entity.Disciplina;

public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}

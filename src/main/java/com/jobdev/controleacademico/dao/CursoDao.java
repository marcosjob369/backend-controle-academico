package com.jobdev.controleacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobdev.controleacademico.entity.Curso;

public interface CursoDao extends JpaRepository<Curso, Long> {

}

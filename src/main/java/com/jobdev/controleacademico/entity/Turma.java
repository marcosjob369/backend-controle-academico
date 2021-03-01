package com.jobdev.controleacademico.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int semestre;
	
	private int ano;
	
	private String sala;
	
	private String predio;	

	@ManyToOne
	private Curso curso;

	@OneToMany
	@JoinColumn(name = "turma_id")
	private List<Disciplina> disciplinas = new ArrayList<>();
}
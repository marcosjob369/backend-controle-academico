package com.jobdev.controleacademico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int periodo;
	
	private int semestre;

	private int ano;

	private String sala;

	private String predio;

	@ManyToOne
	private Curso curso;
}
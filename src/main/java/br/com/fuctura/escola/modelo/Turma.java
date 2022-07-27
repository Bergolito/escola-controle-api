package br.com.fuctura.escola.modelo;

import java.time.LocalDateTime;

public class Turma {

	private Long id;
	private String nome;
	private Professor professor;
	private Curso curso;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private Integer cargaHoraria;
	
}

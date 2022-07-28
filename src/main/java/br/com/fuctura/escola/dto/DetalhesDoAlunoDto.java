package br.com.fuctura.escola.dto;

import java.time.LocalDate;

import br.com.fuctura.escola.modelo.Aluno;


public class DetalhesDoAlunoDto {

	private Long id;
	private String cpf;
	private String nome;
	private String email;
	private String fone;
	private LocalDate dataNasc;
	private String tipo;
	
	public DetalhesDoAlunoDto(Aluno aluno) {
		this.id = aluno.getId();
		this.cpf = aluno.getCpf();
		this.nome = aluno.getNome();
		this.email = aluno.getEmail();
		this.fone = aluno.getFone();
		this.dataNasc = aluno.getDataNasc();
		this.tipo = aluno.getTipo().toString();
	}

	public Long getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getFone() {
		return fone;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public String getTipo() {
		return tipo;
	}

	
}

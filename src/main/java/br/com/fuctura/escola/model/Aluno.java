package br.com.fuctura.escola.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Aluno {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, name = "CPF")
	private String cpf;
	
	@Column(nullable = false, name = "NOME")
	private String nome;
	
	@Column(nullable = true, name = "EMAIL")
	private String email;
	
	@Column(nullable = false, name = "FONE")
	private String fone;

	@Column(nullable = false, name = "TIPO")
	private String tipo = TipoAluno.CONVENCIONAL.toString();

	public Aluno() {
		//
	}

	public Aluno(String cpf, String nome, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public Aluno(String cpf, String nome, String email, String fone, String tipo) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

package br.com.fuctura.escola.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.fuctura.escola.modelo.Aluno;

public class AlunoDto {

	private Long id;
	
	//@NotNull @NotEmpty @Length(min = 11, max = 11)
	private String cpf;
	
	//@NotNull @NotEmpty @Length(min = 5)
	private String nome;
	
	private String email;
	private String fone;
	private LocalDate dataNasc;
	private String tipo;
	
	public AlunoDto(Aluno aluno) {
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

	public static List<AlunoDto> converter(List<Aluno> alunos) {
		return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
	}

}

package br.com.fuctura.escola.controller.form;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import br.com.fuctura.escola.modelo.Aluno;
import br.com.fuctura.escola.repository.AlunoRepository;

public class AtualizacaoAlunoForm {
	
	@NotNull @NotEmpty  @Length(min = 5)
	private String nome;
	
	@Nullable
	private String email;
	
	@Nullable
	private String fone;

	@Nullable
	private String dataNasc;
	
	@Nullable
	private String tipo;

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getFone() {
		return fone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public String getTipo() {
		return tipo;
	}

	public Aluno atualizar(Long id, AlunoRepository alunoRepository) {
		Aluno aluno = alunoRepository.getOne(id);
		
		aluno.setNome(this.nome);
		aluno.setEmail(this.email);
		aluno.setFone(this.fone);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateTime = LocalDate.parse(this.dataNasc, formatter);
		aluno.setDataNasc(dateTime);
		
		aluno.setTipo(this.tipo);
		
		return aluno;
	}
	
}

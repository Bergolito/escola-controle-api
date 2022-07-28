package br.com.fuctura.escola.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.escola.dto.AlunoDto;
import br.com.fuctura.escola.modelo.Aluno;

@RestController
@RequestMapping("/teste")
public class TesteController {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	@GetMapping("/listar1")
	public List<Aluno> listarAlunosModelo(){
		
		LocalDate dt1 = LocalDate.parse("2000-04-14", formatter);
		LocalDate dt2 = LocalDate.parse("2001-05-07", formatter);
		LocalDate dt3 = LocalDate.parse("2003-11-07", formatter);

		Aluno aluno1 = new Aluno("44444444444", "Aluno 1", "aluno1@escola.com", "81 1234-4444", dt1, "CONVENCIAONAL");
		Aluno aluno2 = new Aluno("55555555555", "Aluno 2", "aluno2@escola.com", "81 1234-4444", dt2, "CONVENCIAONAL");
		Aluno aluno3 = new Aluno("66666666666", "Aluno 3", "aluno3@escola.com", "81 1234-4444", dt3, "MONITOR");
		
		return Arrays.asList(aluno1, aluno2, aluno3);
	}

	@GetMapping("/listar2")
	public List<AlunoDto> listarAlunosDto(){
		
		LocalDate dt1 = LocalDate.parse("2000-04-14", formatter);
		LocalDate dt2 = LocalDate.parse("2001-05-07", formatter);
		LocalDate dt3 = LocalDate.parse("2003-11-07", formatter);

		Aluno aluno1 = new Aluno("44444444444", "Aluno 1", "aluno1@escola.com", "81 1234-4444", dt1, "CONVENCIAONAL");
		Aluno aluno2 = new Aluno("55555555555", "Aluno 2", "aluno2@escola.com", "81 1234-4444", dt2, "CONVENCIAONAL");
		Aluno aluno3 = new Aluno("66666666666", "Aluno 3", "aluno3@escola.com", "81 1234-4444", dt3, "MONITOR");
		
		List<Aluno> listaAluno = Arrays.asList(aluno1, aluno2, aluno3);
		return AlunoDto.converter(listaAluno);
	}

}








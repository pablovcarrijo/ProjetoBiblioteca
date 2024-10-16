package model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {

	private Livros livro;
	private Cliente cliente;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	public Emprestimo(Livros livro, Cliente cliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
		this.cliente = cliente;
		this.livro = livro;
		this.dataDevolucao = dataDevolucao;
		this.dataEmprestimo = dataEmprestimo;
	}

	public Livros getLivro() {
		return livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	
	public long calcularDiasAtrasados(LocalDate dataAtual) {
		long days = 0;
		if(dataAtual.isAfter(dataDevolucao)) {
			days = ChronoUnit.DAYS.between(dataDevolucao, dataAtual);
		}
		return days;
	}
	
	public Double valorMulta(LocalDate dataAtual) {
		long diasAtrasos = calcularDiasAtrasados(dataAtual);
		return diasAtrasos * 5.0;
	}
	
	@Override
	public String toString() {
		return "Emprestimo: (" +
				"livro = " + livro + ", usuário = " + cliente + " Data emprestimo = " + dataEmprestimo +
				" Data devolução = " + dataDevolucao;
	}
	
}

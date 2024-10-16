package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Cliente;
import model.entities.Emprestimo;
import model.entities.Livros;

public class App {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		List<Livros> livros = new ArrayList<>();
		List<Cliente> clientes = new ArrayList<>();
		List<Emprestimo> emprestimos = new ArrayList<>();
		
		Livros livro1 = new Livros("O Senhor dos Aneis", "J.R.R Tolkien", 3);
		livros.add(livro1);
		Livros livro2 = new Livros("Percy Jackson", "Maria", 2);
		livros.add(livro2);
		
		Cliente cliente1 = new Cliente("Pablo Vinicius", "126.394.636-40", "(34)9 9339-8697");
		clientes.add(cliente1);
		System.out.println("Usuário cadastrado: " + cliente1);
		
		LocalDate now = LocalDate.now();
		String hojeString = now.format(fmt);
		LocalDate hoje = LocalDate.parse(hojeString, fmt);
		
		LocalDate dataDevolucao = hoje.plusDays(7);
		Emprestimo emp1 = new Emprestimo(livro1, cliente1, hoje, dataDevolucao);
		livro1.setQuantity(livro1.getQuantity() - 1);
		System.out.println(emp1);
		
		LocalDate dataAtual = hoje.plusDays(10);
		Double multa = emp1.valorMulta(dataAtual);
		livro1.setQuantity(livro1.getQuantity() + 1);
		
		System.out.println(emp1);
		System.out.println("Devolução realizada por " + cliente1.getName() + " - Livro: " + emp1.getLivro().getName()
				+ " - Dias de atrasado: " + emp1.calcularDiasAtrasados(dataAtual) + " - Multa: R$"
				+ String.format("%.2f", emp1.valorMulta(dataAtual)));
		
	}

}

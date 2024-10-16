package model.entities;

public class Livros {

	private String name;
	private String author;
	private Integer quantity;
	
	public Livros(String name, String author, Integer quantity) {
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Título do livro: " + getName() + " - author: " + getAuthor();
	}
	
}

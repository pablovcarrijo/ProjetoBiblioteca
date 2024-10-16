package model.entities;

public class Cliente {

	private String name;
	private String cpf;
	private String number;
	
	public Cliente(String name, String cpf, String number) {
		this.name = name;
		this.cpf = cpf;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Usuário: " + getName() + " - CPF:" + getCpf() + " - Number: " + getNumber();
	}
	
}

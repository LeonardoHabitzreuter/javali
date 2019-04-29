package br.com.prova.crud.modelo;

public class Cliente extends Pessoa {

	private String senha;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

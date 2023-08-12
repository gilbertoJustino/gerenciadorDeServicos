package model;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	public Cliente() {		
	}

	public Cliente(long id, String nome, String email, String telefone,Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	
	

}

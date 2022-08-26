package com.example.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contatos {
    @Id 
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
			@Column(length = 50, nullable = false)
	private String nome;
			
			@Column(length =  14)
		
	private String fone;
	@Column(length = 50, nullable = false, unique = true)
	private String email;
	
	
	
	
	
	public Contatos(int id, String nome, String fone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}
	
	
	
	public Contatos() {
		
	}
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getFone() {
		return fone;
	}



	public void setFone(String fone) {
		this.fone = fone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	

	
}

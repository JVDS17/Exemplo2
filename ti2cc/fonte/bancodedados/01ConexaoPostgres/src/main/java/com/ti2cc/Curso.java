package com.ti2cc;

public class Curso {
	private int id;
	private String nome;
	
	public Curso() {
		this.id = -1;
		this.nome = "";
	}
	
	public Curso(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Curso [id =" + id + ", nome =" + nome +"]";
	}
	
}

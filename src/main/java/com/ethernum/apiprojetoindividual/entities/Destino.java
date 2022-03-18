package com.ethernum.apiprojetoindividual.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Long telefone;
	private Double cpf;
	private String email;
	private String localdepartida;
	private String localdedestino;
	private String datadepartida;
	private String datadechegada;
	
	public Destino(Long id, String nome, Long telefone, Double cpf, String email, String localdepartida,
			String localdedestino, String datadepartida, String datadechegada) {
		
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
		this.localdepartida = localdepartida;
		this.localdedestino = localdedestino;
		this.datadepartida = datadepartida;
		this.datadechegada = datadechegada;
	}
	
	public Destino ()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Double getCpf() {
		return cpf;
	}

	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocaldepartida() {
		return localdepartida;
	}

	public void setLocaldepartida(String localdepartida) {
		this.localdepartida = localdepartida;
	}

	public String getLocaldedestino() {
		return localdedestino;
	}

	public void setLocaldedestino(String localdedestino) {
		this.localdedestino = localdedestino;
	}

	public String getDatadepartida() {
		return datadepartida;
	}

	public void setDatadepartida(String datadepartida) {
		this.datadepartida = datadepartida;
	}

	public String getDatadechegada() {
		return datadechegada;
	}

	public void setDatadechegada(String datadechegada) {
		this.datadechegada = datadechegada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		return Objects.equals(id, other.id);
	}	
}


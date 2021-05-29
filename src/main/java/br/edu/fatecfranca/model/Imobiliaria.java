package br.edu.fatecfranca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imobiliaria")
public class Imobiliaria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1810323619659271173L;

	@Id	// Primary Key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String endereco;
	private int creci;
	private String site;
	
	public Imobiliaria(Long id, String nome, String endereco, int creci, String site) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.creci = creci;
		this.site = site;
	}
	
	public Imobiliaria() {
		
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCreci() {
		return creci;
	}

	public void setCreci(int creci) {
		this.creci = creci;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	
}

package com.crud.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MaintenanceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ig;
	
	@Column
	private Date dia;
	
	@Column
	private String nome;
	
	@Column
	private double valor;

	public MaintenanceModel() {
		super();
	}

	public Long getIg() {
		return ig;
	}

	public void setIg(Long ig) {
		this.ig = ig;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "MaintenanceModel [ig=" + ig + ", dia=" + dia + ", nome=" + nome + ", valor=" + valor + "]";
	}

}

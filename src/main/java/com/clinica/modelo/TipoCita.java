package com.clinica.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipocita")
public class TipoCita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoCita;
	
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

	public int getIdTipoCita() {
		return idTipoCita;
	}

	public void setIdTipoCita(int idTipoCita) {
		this.idTipoCita = idTipoCita;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

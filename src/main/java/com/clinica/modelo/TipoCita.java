package com.clinica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

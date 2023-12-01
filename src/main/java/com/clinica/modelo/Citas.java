package com.clinica.modelo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="citas")
public class Citas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCita;
	
	@Column(name="altura")
	private double altura;
	@Column(name="dni")
	private int dni;
	@Column(name="estado")
	private int estado;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="peso")
	private double peso;
	@Column(name="sexo", length = 255, nullable = false)
	private String sexo;
	
	@ManyToOne
	@JoinColumn(name="idTipoCita")
	private TipoCita tipocita;
	@ManyToOne
	@JoinColumn(name="idUsuario")
	@JsonIgnore
	private Usuario usuario;
	public int getIdCita() {
		return idCita;
	}
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public TipoCita getTipocita() {
		return tipocita;
	}
	public void setTipocita(TipoCita tipocita) {
		this.tipocita = tipocita;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}

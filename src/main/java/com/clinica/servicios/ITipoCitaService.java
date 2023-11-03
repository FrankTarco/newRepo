package com.clinica.servicios;

import java.util.List;

import com.clinica.modelo.TipoCita;

public interface ITipoCitaService {

	
	List<TipoCita> listar();
	TipoCita registrar(TipoCita tipocita);
	TipoCita actualizar(TipoCita tipocita);
	void eliminar(Integer codigo);
	TipoCita ListarPorId(Integer codigo);
}

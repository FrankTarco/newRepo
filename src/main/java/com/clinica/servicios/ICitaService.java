package com.clinica.servicios;

import java.util.List;

import com.clinica.modelo.Citas;

public interface ICitaService {

	List<Citas> listar();
	Citas registrar(Citas citas);
	Citas actualizar(Citas citas);
	void eliminar(Integer codigo);
	Citas ListarPorId(Integer codigo);
}

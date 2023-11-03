package com.clinica.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.modelo.Citas;
import com.clinica.repositorios.ICitaRepository;
import com.clinica.servicios.ICitaService;

@Service
public class CitaServiceImpl implements ICitaService{

	@Autowired
	ICitaRepository repo;
	
	@Override
	public List<Citas> listar() {
		return repo.findAll();
	}

	@Override
	public Citas registrar(Citas citas) {
		return repo.save(citas);
	}

	@Override
	public Citas actualizar(Citas citas) {
		return repo.save(citas);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Citas ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
	
}

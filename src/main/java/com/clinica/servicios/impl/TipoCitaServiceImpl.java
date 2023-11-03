package com.clinica.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.modelo.TipoCita;
import com.clinica.repositorios.ITipoCitaRepository;
import com.clinica.servicios.ITipoCitaService;

@Service
public class TipoCitaServiceImpl implements ITipoCitaService {

	@Autowired
	ITipoCitaRepository repo;
	
	@Override
	public List<TipoCita> listar() {
		return repo.findAll();
	}

	@Override
	public TipoCita registrar(TipoCita tipocita) {
		return repo.save(tipocita);
	}

	@Override
	public TipoCita actualizar(TipoCita tipocita) {
		return repo.save(tipocita);
	}

	@Override
	public void eliminar(Integer codigo) {
			repo.deleteById(codigo);
	}

	@Override
	public TipoCita ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}

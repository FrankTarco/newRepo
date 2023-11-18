package com.clinica.servicios.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import com.clinica.modelo.Citas;
import com.clinica.modelo.Usuario;
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
//		Usuario usuario = new Usuario();
//		usuario.setIgnoreAuthorities(true);
//		
//		// Luego, cuando llames a getAuthorities(), devolverá una colección vacía o lo que se defina en el método
//		Collection<? extends GrantedAuthority> authorities = usuario.getAuthorities();
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

	@Override
	public List<Citas> buscarCitaPorEstado(Integer estado) {
	    return repo.findByEstado(estado);
	}

//	@Override
//	public Citas buscarCitaPorEstado(Integer estado) {
//		return repo.findByEstado(estado);
//	}
	
//	public Citas buscarCitaPorEstado(int estado) {
//        return repo.findByEstado(estado);
//    }
}

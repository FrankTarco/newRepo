package com.clinica.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.modelo.TipoCita;
import com.clinica.servicios.ITipoCitaService;

@RestController
@RequestMapping("/tipocita")
@CrossOrigin("*")
public class TipoCitaController {

	@Autowired
	ITipoCitaService service;
	
	@GetMapping("/")
	public ResponseEntity<List<TipoCita>> listar(){
		List<TipoCita> obj = service.listar();
		return new ResponseEntity<List<TipoCita>>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<TipoCita> registrar(@RequestBody TipoCita tipocita){
		TipoCita obj = service.registrar(tipocita);
		return new ResponseEntity<TipoCita>(obj, HttpStatus.OK);
	}

	@PutMapping("/")
	public ResponseEntity<TipoCita> actualizar(@RequestBody TipoCita tipocita){
		TipoCita obj = service.registrar(tipocita);
		return new ResponseEntity<TipoCita>(obj, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		TipoCita obj = service.ListarPorId(id);
		if(obj == null) {
			throw new Exception("No se encontró ID de conductor");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoCita> listarPorId(@PathVariable("id") Integer codigo) throws Exception{
		TipoCita obj = service.ListarPorId(codigo);
		if(obj == null) {
			throw new Exception("No se encontró ID de conductor");
		}
		return new ResponseEntity<TipoCita>(obj, HttpStatus.OK);
	}
}

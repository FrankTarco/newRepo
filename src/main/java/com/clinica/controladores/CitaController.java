package com.clinica.controladores;

import java.net.URI;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.clinica.modelo.Citas;
import com.clinica.modelo.Citas;
import com.clinica.servicios.ICitaService;


@RestController
@RequestMapping("/citas")
@CrossOrigin("*")
public class CitaController {
//comentario
	@Autowired
	private ICitaService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Citas>> listar(){
		List<Citas> obj = service.listar();
		return new ResponseEntity<List<Citas>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@RequestBody Citas citas){
		Citas obj = service.registrar(citas);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdCita()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@PutMapping
	public ResponseEntity<Citas> actualizar(@RequestBody Citas citas){
		Citas obj = service.registrar(citas);
		return new ResponseEntity<Citas>(obj, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Citas obj = service.ListarPorId(id);
		if(obj == null) {
			throw new Exception("No se encontró ID de conductor");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Citas> listarPorId(@PathVariable("id") Integer codigo) throws Exception{
		Citas obj = service.ListarPorId(codigo);
		if(obj == null) {
			throw new Exception("No se encontró ID de conductor");
		}
		return new ResponseEntity<Citas>(obj, HttpStatus.OK);
	}
}

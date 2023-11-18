package com.clinica;

import com.clinica.modelo.Usuario;
import com.clinica.servicios.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class sergioM22BackEndClinicaOdontologiaApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(sergioM22BackEndClinicaOdontologiaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}

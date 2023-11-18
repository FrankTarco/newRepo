package com.clinica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,String> {

    public Usuario findByUsername(String username);

}

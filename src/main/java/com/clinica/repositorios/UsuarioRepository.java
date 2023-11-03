package com.clinica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}

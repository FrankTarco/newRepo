package com.clinica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.modelo.Rol;

public interface RolRepository extends JpaRepository<Rol,Long> {
}

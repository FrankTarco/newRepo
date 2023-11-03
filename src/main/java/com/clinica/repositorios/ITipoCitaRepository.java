package com.clinica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.modelo.TipoCita;

public interface ITipoCitaRepository extends JpaRepository<TipoCita, Integer>{

}

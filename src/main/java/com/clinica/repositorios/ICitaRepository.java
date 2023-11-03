package com.clinica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinica.modelo.Citas;


public interface ICitaRepository extends JpaRepository<Citas, Integer>{

}

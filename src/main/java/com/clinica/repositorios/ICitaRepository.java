package com.clinica.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import com.clinica.modelo.Citas;


public interface ICitaRepository extends JpaRepository<Citas, Integer>{
	
	 @Query("SELECT c FROM Citas c WHERE c.estado= :estado")
	 List<Citas> findByEstado(@Param("estado") int estado);
//	 Citas buscarCitaEspera(@Param("estado") int estado);
//	 Citas buscarCitaFinalizada(@Param("estado") int estado);
}

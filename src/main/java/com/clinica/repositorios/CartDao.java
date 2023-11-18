package com.clinica.repositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinica.modelo.Cart;
import com.clinica.modelo.Usuario;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(Usuario user);
}

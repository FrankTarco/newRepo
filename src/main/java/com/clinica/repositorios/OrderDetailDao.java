package com.clinica.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.clinica.modelo.OrderDetail;
import com.clinica.modelo.Usuario;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(Usuario user);

    public List<OrderDetail> findByOrderStatus(String status);
}

package com.clinica.servicios;

import java.util.Set;

import com.clinica.modelo.Usuario;
import com.clinica.modelo.UsuarioRol;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}

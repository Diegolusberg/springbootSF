package com.sistemaFacturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaFacturacion.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}

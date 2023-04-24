package com.sistemaFacturacion.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaFacturacion.entity.Usuario;
import com.sistemaFacturacion.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> getUsuarios() {
		return repository.findAll();
	}
	
	public Usuario consultarPorId(Long id) throws EntityNotFoundException {
		return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("ID no encontrado")
        );
	}
	
	public void insertarUsuario(Usuario usuario) {
		repository.saveAndFlush(usuario);
	}

}

package com.sistemaFacturacion.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sistemaFacturacion.entity.Usuario;
import com.sistemaFacturacion.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	

	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public List<Usuario> getUsuarios() {
		return repository.findAll();
	}
	
	public Usuario consultarPorId(Long id) throws EntityNotFoundException {
		return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("ID no encontrado")
        );
	}
	
	public void insertarUsuario(Usuario usuario) {
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		repository.saveAndFlush(usuario);
	}

}

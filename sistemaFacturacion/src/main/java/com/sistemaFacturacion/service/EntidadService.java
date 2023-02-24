package com.sistemaFacturacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.sistemaFacturacion.entity.Entidad;
import com.sistemaFacturacion.repository.EntidadRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EntidadService {
  
	@Autowired
	private EntidadRepository repository;
	
	public List<Entidad> getEntidades() {
		return repository.findAll();
	}
	
	public Entidad consultarPorId(Long id) throws EntityNotFoundException {
		return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("ID no encontrado")
        );
	}
	
	public void insertarEntidad(Entidad entidad) {
		repository.saveAndFlush(entidad);
	}
	
	
	
}

package com.sistemaFacturacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaFacturacion.entity.Mercaderia;
import com.sistemaFacturacion.repository.MercaderiaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MercaderiaService {
	
	@Autowired
	private MercaderiaRepository repository;
	
	public List<Mercaderia> getMercaderias() {
		return repository.findAll();
	}
	
	public Mercaderia consultarPorId(Long id) throws EntityNotFoundException {
		return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("ID no encontrado")
        );
	}
	
	public void insertarMercaderia(Mercaderia mercaderia) {
		repository.saveAndFlush(mercaderia);
	}

}

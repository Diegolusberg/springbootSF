package com.sistemaFacturacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaFacturacion.entity.Factura;
import com.sistemaFacturacion.repository.FacturaRepository;

@Service
public class FacturaService {
	
	
	@Autowired
	private FacturaRepository repository;
	
	
	public List<Factura> getFacturas(){
		return repository.findAll();
	} 

}

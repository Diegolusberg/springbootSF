package com.sistemaFacturacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaFacturacion.entity.Factura;
import com.sistemaFacturacion.service.FacturaService;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
   
	
	@Autowired
	private FacturaService service;
	
	
	@GetMapping("/listar")
	public List<Factura> getFacturasList(){
		return service.getFacturas();
	}
	
	
	@GetMapping("/listartodos")
	public ResponseEntity<?> getMercaderiasTodas(){
		try {
			return ResponseEntity.ok(service.getFacturas());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
}

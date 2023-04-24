package com.sistemaFacturacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaFacturacion.entity.Entidad;
import com.sistemaFacturacion.service.EntidadService;

@RestController
@RequestMapping("/entidades")
public class EntidadController {
	
	@Autowired
	private EntidadService service;
	
	@GetMapping("/listar")
	public ResponseEntity<?> getEntidadesTodas(){
		try {
			return ResponseEntity.ok(service.getEntidades());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@PostMapping("/insertar")
	public ResponseEntity<?> insertarEntidad(@RequestBody Entidad entidad){
		try {
			service.insertarEntidad(entidad);
			return ResponseEntity.ok(service.consultarPorId(entidad.getId()));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		
	}

}

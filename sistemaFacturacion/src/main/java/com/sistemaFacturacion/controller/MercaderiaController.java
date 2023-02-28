package com.sistemaFacturacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaFacturacion.entity.Mercaderia;
import com.sistemaFacturacion.service.MercaderiaService;

@RestController
@RequestMapping("/mercaderias")
public class MercaderiaController {
	
	@Autowired
	private MercaderiaService service;
	
	@GetMapping("/listar")
	public ResponseEntity<?> getMercaderiasTodas(){
		try {
			return ResponseEntity.ok(service.getMercaderias());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<?> getMercaderiaPorID(@PathVariable Long id){
		try {
			return ResponseEntity.ok(service.consultarPorId(id));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@PostMapping("/insertar")
	public ResponseEntity<?> insertarMercaderia(@RequestBody Mercaderia mercaderia){
		try {
			service.insertarMercaderia(mercaderia);
			return ResponseEntity.ok(service.consultarPorId(mercaderia.getId()));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		
	}

}

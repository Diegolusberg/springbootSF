package com.sistemaFacturacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaFacturacion.entity.Usuario;
import com.sistemaFacturacion.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("")
	public ResponseEntity<?> getUsuarios(){
		try {
			return ResponseEntity.ok(service.getUsuarios());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUsuarioPorID(@PathVariable Long id){
		try {
			return ResponseEntity.ok(service.consultarPorId(id));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@PostMapping("/insertar")
	public ResponseEntity<?> insertarMercaderia(@RequestBody Usuario usuario){
		try {
			service.insertarUsuario(usuario);
			return ResponseEntity.ok(service.consultarPorId(usuario.getId()));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		
	}


}
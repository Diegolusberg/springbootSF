package com.sistemaFacturacion.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "entidades")
@Getter
@Setter
public class Entidad implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@Column(name = "cod_entidad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String email;
	
	@Column
	private String telefono;
	
	@OneToMany(mappedBy = "entidad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Factura> facturas;
	
	public void addFactura(Factura factura) {
		facturas.add(factura);
	}

	public Entidad() {
		facturas = new ArrayList<Factura>();
	}

}

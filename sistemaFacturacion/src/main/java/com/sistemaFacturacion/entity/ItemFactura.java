package com.sistemaFacturacion.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "facturas_items")
@Getter
@Setter
public class ItemFactura implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mercaderia_id")
	private Mercaderia mercaderia;
	
	public Double calcularImporte() {
		return cantidad.doubleValue() * mercaderia.getPrecio();
	}
}

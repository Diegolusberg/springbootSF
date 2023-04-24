package com.sistemaFacturacion.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mercaderias")
@Getter
@Setter
public class Mercaderia implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_mercaderia")
    private String nombre;
    
    private Double precio;

    public String getIdNome() {
        return "(" + id + ") " + nombre;
    }


}

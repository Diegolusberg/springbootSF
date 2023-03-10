package com.sistemaFacturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaFacturacion.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long>{

}

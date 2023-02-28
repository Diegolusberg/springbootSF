package com.sistemaFacturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaFacturacion.entity.Mercaderia;

public interface MercaderiaRepository extends JpaRepository<Mercaderia, Long> {

}

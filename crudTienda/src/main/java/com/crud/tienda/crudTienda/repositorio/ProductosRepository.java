package com.crud.tienda.crudTienda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.tienda.crudTienda.modelo.Producto;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}

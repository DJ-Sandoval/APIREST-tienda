package com.crud.tienda.crudTienda.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.tienda.crudTienda.modelo.Producto;
import com.crud.tienda.crudTienda.repositorio.ProductosRepository;

@Service
public class PorductoServicio {

    @Autowired
    private ProductosRepository repositorio;

    public List<Producto> listarProductos() {
        return repositorio.findAll();
    }

    public void guardarProducto(Producto producto) {
        repositorio.save(producto);
    }

    public Producto obtenerProductoPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public void eliminarProducto(Integer id) {
        repositorio.deleteById(id);
    }
}

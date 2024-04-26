package com.hotel.trivoli.repositories;

import java.util.List;

import com.hotel.trivoli.entities.Producto;

public class ProductoRepositoryClass {

    private ProductoRepository productoRepository;

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    // public List<Producto> getByCategoria(Long idCategoria) {
    // return productoRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    // }
}

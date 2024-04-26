package com.hotel.trivoli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.trivoli.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery
    // = true)
    // List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
}

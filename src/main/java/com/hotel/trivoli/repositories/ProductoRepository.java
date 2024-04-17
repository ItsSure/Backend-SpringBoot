package com.hotel.trivoli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.trivoli.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}

package com.hotel.trivoli.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.trivoli.repositories.ProductoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.hotel.trivoli.entities.Producto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/productos")
@Tag(name = "Gestión de Productos", description = "Endpoints para operaciones relacionadas con productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @Operation(summary = "Obtener todos los productos")
    @GetMapping()
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Operation(summary = "Obtener un producto por su ID")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Producto encontrado"),
            @ApiResponse(responseCode = "404", description = "Producto no encontrado") })
    @GetMapping("/{id}")
    public Producto getProductById(@PathVariable Long id) {
        return productoRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro la wea: " + id));
    }

    @Operation(summary = "Crear un nuevo producto")
    @PostMapping()
    public Producto createProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    @Operation(summary = "Actualizar un producto existente")
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto details) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro la wea: " + id));
        Producto updatedProducto = Producto.builder().id(producto.getId()).nombre(details.getNombre())
                .precio(details.getPrecio()).categoria(producto.getCategoria()).build();
        return productoRepository.save(updatedProducto);
    }

    @Operation(summary = "Eliminar un producto")
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro la wea: " + id));
        productoRepository.delete(producto);
        return "Exitoso: " + id;
    }

}

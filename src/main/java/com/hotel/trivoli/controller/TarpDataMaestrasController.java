package com.hotel.trivoli.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.trivoli.entities.TarpDataMaestras;
import com.hotel.trivoli.service.TarpDataMaestrasService;
import com.hotel.trivoli.util.ResponseMessage;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/maestras")
@Tag(name = "Maestras", description = "Endpoints para operaciones relacionadas con las maestras")
public class TarpDataMaestrasController {

    private TarpDataMaestrasService tarpdatamaestrasService;

    private final Logger log = LoggerFactory.getLogger(TarpDataMaestrasController.class);

    public TarpDataMaestrasController(TarpDataMaestrasService tarpdatamaestrasService) {
        this.tarpdatamaestrasService = tarpdatamaestrasService;
    }

    @GetMapping({ "/api/tarpdatamaestras/getXId/{id}", "/api-movil/tarpdatamaestras/getXId/{id}" })
    public ResponseEntity<ResponseMessage<List<TarpDataMaestras>>> getXId(@PathVariable Long id) {
        log.debug("REST request to  getXId : {}", id);
        List<TarpDataMaestras> lista = tarpdatamaestrasService.getXId(id);

        return ResponseEntity.ok(new ResponseMessage<>(0, null, lista));
    }

}

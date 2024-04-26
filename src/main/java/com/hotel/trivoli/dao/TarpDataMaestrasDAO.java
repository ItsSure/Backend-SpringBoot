package com.hotel.trivoli.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.trivoli.entities.TarpDataMaestras;

@Repository
public interface TarpDataMaestrasDAO extends JpaRepository<TarpDataMaestras, Long> {

    // String sqlSelect =
    // ManagerQuery.getInstance().getQuery("query_list_maestras");

    // @Query(value = "SELECT t FROM TarpDataMaestras t WHERE t.nmmaestro = ?1")
    List<TarpDataMaestras> findByNmmaestro(long nmmaestro);

}

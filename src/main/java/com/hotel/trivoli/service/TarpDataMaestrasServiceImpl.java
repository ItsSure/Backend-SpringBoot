package com.hotel.trivoli.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hotel.trivoli.dao.TarpDataMaestrasDAO;
import com.hotel.trivoli.entities.TarpDataMaestras;

@Service
public class TarpDataMaestrasServiceImpl implements TarpDataMaestrasService {

    private TarpDataMaestrasDAO tarpDataMaestrasDAO;

    public TarpDataMaestrasServiceImpl(TarpDataMaestrasDAO tarpDataMaestrasDAO) {
        this.tarpDataMaestrasDAO = tarpDataMaestrasDAO;
    }

    private final Logger log = LoggerFactory.getLogger(TarpDataMaestrasServiceImpl.class);

    @Override
    public List<TarpDataMaestras> getXId(Long cdmaestra) {
        log.debug("Request to get TarpDataMaestras by cd : {}", cdmaestra);
        return tarpDataMaestrasDAO.findByNmmaestro(cdmaestra);

    }

}

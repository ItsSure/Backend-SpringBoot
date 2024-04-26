package com.hotel.trivoli.config;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import org.springframework.core.io.ClassPathResource;

import com.hotel.trivoli.controller.errors.ApplicationCustomException;

public class ManagerQuery {

	private static final Logger LOG = LogManager.getLogger(ManagerQuery.class);

	private static ManagerQuery instance;
	private JSONObject query;

	public static ManagerQuery getInstance() {
		if (instance == null) {
			instance = new ManagerQuery();
			try {
				instance.load();
			} catch (ApplicationCustomException e) {
				LOG.error(e.getMessage(), e);
			}
		}
		return instance;
	}

	public void load() throws ApplicationCustomException {
		try {
			InputStream insfile = new ClassPathResource("sql.json").getInputStream();
			query = readFileJSONObject(insfile);
		} catch (Exception pe) {
			LOG.error(pe.getMessage(), pe);
			throw new ApplicationCustomException(1, "Error al cargar archivo sql.json");
		}
	}

	public JSONObject readFileJSONObject(InputStream inputStream) {
		JSONObject jsonObject = null;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
			StringBuilder jsonString = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				jsonString.append(line);
			}
			jsonObject = new JSONObject(jsonString.toString());
		} catch (IOException e) {
			LOG.error("Error de lectura del archivo: " + e.getMessage());
		} catch (JSONException e) {
			LOG.error("Error al parsear el JSON: " + e.getMessage());
		}
		return jsonObject;
	}

	public String getQuery(String keyQuery) {
		return (String) query.get(keyQuery);
	}

}

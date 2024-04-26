package com.hotel.trivoli.entities;

import com.hotel.trivoli.util.Auditoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tarp_data_maestras")
public class TarpDataMaestras extends Auditoria implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nmdato;
	@NotNull(message = com.hotel.trivoli.util.MessagesConstants.MANDATORY_FIELD)
	private long nmmaestro;
	@Size(max = 20, message = com.hotel.trivoli.util.MessagesConstants.MAX_VALIDATION_FIELD + " (20)")
	private String cddato;
	@Size(max = 200, message = com.hotel.trivoli.util.MessagesConstants.MAX_VALIDATION_FIELD + " (200)")
	private String dsdato;
}

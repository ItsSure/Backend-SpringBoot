package com.hotel.trivoli.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.sql.Timestamp;

@Data
public class Auditoria {
    private String cdestado;
    private String cdusuario;
    private LocalDateTime dtfechacreacion;
    private LocalDateTime dtfechamodificacion;

    @JsonIgnore
    public void setDataFromRs(ResultSet rs) throws SQLException {
        cdestado = rs.getString("cdestado");
        cdusuario = rs.getString("cdusuario");
        dtfechacreacion = getLocalDateTime(rs.getTimestamp("dtfechacreacion"));
        dtfechamodificacion = getLocalDateTime(rs.getTimestamp("dtfechamodificacion"));
    }

    public LocalDateTime getLocalDateTime(Timestamp tmp) {
        if (tmp == null) {
            return null;
        }
        return tmp.toLocalDateTime();
    }
}

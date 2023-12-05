package com.sblm.intranetmsasistencias.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AsistenciaServicio {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AsistenciaServicio(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> obtenerAsistenciasPorDni(String dni) {
        String sql = "SELECT * FROM personal_sblm.rrhh.tb_asistencia WHERE codreloj = ? ORDER BY dhoraingre DESC";
        return jdbcTemplate.queryForList(sql, dni);
    }

    public List<Map<String, Object>> obtenerAsistenciasPorDniYMes(String dni, int mes) {
        String sql = "SELECT * FROM personal_sblm.rrhh.tb_asistencia WHERE codreloj = ? " +
                "AND MONTH(dfechaingre) = ? ORDER BY dhoraingre DESC";
        return jdbcTemplate.queryForList(sql, dni, mes);
    }

}

package com.sblm.intranetmsasistencias.controladores;


import com.sblm.intranetmsasistencias.servicios.AsistenciaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("/asistencia")
public class AsistenciaControlador {

    private final AsistenciaServicio asistenciaServicio;

    @Autowired
    public AsistenciaControlador(AsistenciaServicio asistenciaServicio) {
        this.asistenciaServicio = asistenciaServicio;
    }

    @GetMapping("/{dni}")
    public List<Map<String, Object>> getAllByCodreloj(@PathVariable String dni) {
        return asistenciaServicio.obtenerAsistenciasPorDni(dni);
    }

    @GetMapping("/{dni}/{mes}")
    public List<Map<String, Object>> getAllByCodrelojAndMonth(@PathVariable String dni, @PathVariable int mes) {
        return asistenciaServicio.obtenerAsistenciasPorDniYMes(dni, mes);
    }

}

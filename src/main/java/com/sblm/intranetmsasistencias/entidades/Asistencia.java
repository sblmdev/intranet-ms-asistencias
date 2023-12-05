package com.sblm.intranetmsasistencias.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asistencia {
    private long idasistencia;
    private String codreloj;
    private String dhoraingre;
    private String dfechaingre;
    private String numreloj;
    private String dfechudp;
    private String vusuario;
    private String vestacion;
    private String papeleta;
    private String idtrab_pap;
}

package com.company.solocejasapp.service;

import com.company.solocejasapp.entity.Local;
import com.haulmont.cuba.security.entity.User;

import java.util.Date;

public interface CrearReporteService {
    String NAME = "solocejasapp_CrearReporteService";

    void crearReporte(Date fecha, User user, Local local, Integer servicios, Long plata_ventas, Integer cant_pestanas, Integer cant_aceites, Long nomina);
}
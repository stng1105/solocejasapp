package com.company.solocejasapp.service;

import com.company.solocejasapp.entity.Local;
import com.company.solocejasapp.entity.Reporte;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;

@Service(CrearReporteService.NAME)
public class CrearReporteServiceBean implements CrearReporteService {

    @Inject
    private DataManager dataManager;

    @Override
    public void crearReporte(Date fecha, User user, Local local, Integer servicios, Long plata_ventas, Integer cant_pestanas, Integer cant_aceites, Long nomina) {
        Reporte reporte = dataManager.create(Reporte.class);
        reporte.setFecha(fecha);
        reporte.setVendedora(user);
        reporte.setLocal(local);
        reporte.setNumeroServicios(servicios);
        reporte.setDineroVentas(plata_ventas);
        reporte.setPestanas(cant_pestanas);
        reporte.setAceites(cant_aceites);
        reporte.setNomina(nomina);
        dataManager.commit(reporte);
    }
}
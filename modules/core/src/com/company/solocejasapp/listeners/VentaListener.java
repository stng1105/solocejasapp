package com.company.solocejasapp.listeners;

import com.company.solocejasapp.entity.Venta;
import com.company.solocejasapp.service.IniciarVentaService;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.app.EntityDiffManager;
import com.haulmont.cuba.core.listener.BeforeAttachEntityListener;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component("solocejasapp_VentaListener")
public class VentaListener implements
        BeforeInsertEntityListener<Venta>,
        BeforeAttachEntityListener<Venta>,
        BeforeUpdateEntityListener<Venta> {

    @Inject
    private IniciarVentaService iniciarVentaService;

    @Override
    public void onBeforeAttach(Venta entity) {
        entity.setFecha(iniciarVentaService.valoresIniciales());
    }

    @Override
    public void onBeforeInsert(Venta entity, EntityManager entityManager) {
        Venta managedEntity = entityManager.merge(entity);
        managedEntity.setFecha(iniciarVentaService.valoresIniciales());
    }

    @Override
    public void onBeforeUpdate(Venta entity, EntityManager entityManager) {
        Venta managedEntity = entityManager.merge(entity);
        managedEntity.setFecha(iniciarVentaService.valoresIniciales());
    }
}

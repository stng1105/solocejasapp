package com.company.solocejasapp.web.screens.venta;

import com.company.solocejasapp.service.IniciarVentaService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Venta;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;
import java.util.Date;
import java.util.TimeZone;

@UiController("solocejasapp_Venta.edit")
@UiDescriptor("venta-edit.xml")
@EditedEntityContainer("ventaDc")
@LoadDataBeforeShow
public class VentaEdit extends StandardEditor<Venta> {

    @Inject
    private UserSession userSession;
    @Inject
    private DataManager dataManager;
    @Inject
    private IniciarVentaService iniciarVentaService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Venta> event) {
        if (dataManager.loadValue("select count(e.numeroVenta) from solocejasapp_Venta e", Integer.class).one() != 0) {
            Integer numero = dataManager.loadValue("select max(e.numeroVenta) from solocejasapp_Venta e", Integer.class).one() + 1;
            event.getEntity().setNumeroVenta(numero);
        } else {
            event.getEntity().setNumeroVenta(1);
        }
        event.getEntity().setFecha(iniciarVentaService.valoresIniciales());
        event.getEntity().setVendedora(userSession.getUser());
    }

}
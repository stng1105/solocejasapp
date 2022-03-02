package com.company.solocejasapp.web.screens.venta;

import com.company.solocejasapp.entity.Local;
import com.company.solocejasapp.entity.Servicio;
import com.company.solocejasapp.entity.Venta;
import com.company.solocejasapp.service.CrearReporteService;
import com.company.solocejasapp.service.IniciarVentaService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@UiController("solocejasapp_Venta.browse")
@UiDescriptor("venta-browse.xml")
@LookupComponent("ventasTable")
@LoadDataBeforeShow
public class VentaBrowse extends StandardLookup<Venta> {
    @Inject
    private CrearReporteService crearReporteService;
    @Inject
    private DataManager dataManager;
    @Inject
    private UserSession userSession;
    @Inject
    private IniciarVentaService iniciarVentaService;
    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;
    @Inject
    private Logger log;

    @Subscribe("crearreporteBtn")
    public void onCrearreporteBtnClick(Button.ClickEvent event) {
        Date fecha = iniciarVentaService.valoresIniciales();

        User vendedora = userSession.getUser();

        String pos = vendedora.getPosition();
        Local local = dataManager.loadValue("select l from solocejasapp_Local l where l.sede = :posicion", Local.class)
                    .parameter("posicion", pos)
                    .one();
        //Venta local = dataManager.load(Venta.class).query("select l from solocejasapp_Venta l where l.fecha = current_date and l.numeroVenta = 53")//l.vendedora = :vendedora group by l.fecha, l.vendedora")
        //        .one();//.parameter("vendedora", userSession.getUser()).one();
        //log.info("localll: " + local);

        Integer sevicios = dataManager.loadValue("select sum(l.cantidadServicios) from solocejasapp_Venta l where l.fecha = current_date and l.vendedora = :vendedora", Integer.class)
                .parameter("vendedora", userSession.getUser()).one();

        Long plata_ventas = dataManager.loadValue("select sum(l.dinero) from solocejasapp_Venta l where l.fecha = current_date and l.vendedora = :vendedora", Long.class)
                .parameter("vendedora", userSession.getUser()).one();

        //Pestañas
        Servicio pestana = dataManager.loadValue("select s from solocejasapp_Servicio s where s.nombre = :cadena", Servicio.class)
                .parameter("cadena", "Pestañas").one();
        //Lista de servicios de Pestañas
        List<Servicio> servicios1 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                        " and v.servicio = :solo_pestanas", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_pestanas", pestana).list();
        List<Servicio> servicios2 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_2 = :solo_pestanas", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_pestanas", pestana).list();
        List<Servicio> servicios3 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_3 = :solo_pestanas", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_pestanas", pestana).list();
        List<Servicio> servicios4 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_4 = :solo_pestanas", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_pestanas", pestana).list();
        List<Servicio> servicios5 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_5 = :solo_pestanas", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_pestanas", pestana).list();
        int cantidad_pestanas = servicios1.size() + servicios2.size() + servicios3.size() + servicios4.size() + servicios5.size();

        //Aceites
        Servicio aceites = dataManager.loadValue("select s from solocejasapp_Servicio s where s.nombre = :cadena", Servicio.class)
                .parameter("cadena", "Aceites").one();
        //Lista de servicios Aceites
        List<Servicio> aceites1 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio = :solo_aceites", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_aceites", aceites).list();
        List<Servicio> aceites2 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_2 = :solo_aceites", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_aceites", aceites).list();
        List<Servicio> aceites3 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_3 = :solo_aceites", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_aceites", aceites).list();
        List<Servicio> aceites4 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_4 = :solo_aceites", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_aceites", aceites).list();
        List<Servicio> aceites5 = dataManager.loadValue("select v from solocejasapp_Venta v where v.fecha = current_date and v.vendedora = :vendedora" +
                " and v.servicio_5 = :solo_aceites", Servicio.class).parameter("vendedora", userSession.getUser()).parameter("solo_aceites", aceites).list();
        int cantidad_aceites = aceites1.size() + aceites2.size() + aceites3.size() + aceites4.size() + aceites5.size();

        Long nomina = (long) (((plata_ventas - (cantidad_pestanas * 5000L)) * 0.4) + (5000L * cantidad_aceites)); //igual = ($ total empleada - (cant pestña*5000))*0.4 + (5000*aceite)
        dialogs.createOptionDialog()
                .withCaption("Crear reporte")
                .withMessage("Crear reporte de hoy, día " + fecha + " ?")
                .withType(Dialogs.MessageType.CONFIRMATION)
                .withActions(new DialogAction(DialogAction.Type.YES) {
                    @Override
                    public void actionPerform(Component component) {

                        /*Venta vent = dataManager.load(Venta.class)
                                .query("select l from solocejasapp_Venta l where l.fecha = current_date group by l.local, l.vendedora = :vendedora")
                                .parameter("vendedora", vendedora).one();*/
                        //.mapToint();

                        crearReporteService.crearReporte(fecha, vendedora, local, sevicios, plata_ventas, cantidad_pestanas, cantidad_aceites, nomina);
                        notifications.create().withCaption("Se creó un nuevo reporte del día de hoy " + fecha).show();
                    }
                }, new DialogAction(DialogAction.Type.NO))
                .show();

    }
}
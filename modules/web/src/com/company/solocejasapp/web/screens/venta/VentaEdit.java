package com.company.solocejasapp.web.screens.venta;

import com.company.solocejasapp.entity.FormaPago;
import com.company.solocejasapp.entity.Local;
import com.company.solocejasapp.entity.Servicio;
import com.company.solocejasapp.entity.Venta;
import com.company.solocejasapp.service.IniciarVentaService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    @Inject
    private Notifications notifications;
    @Inject
    private LookupPickerField<Servicio> servicio1Field;
    @Inject
    private LookupPickerField<Servicio> servicio_2Field;
    @Inject
    private LookupPickerField<Servicio> servicio_3Field;
    @Inject
    private LookupPickerField<Servicio> servicio_4Field;
    @Inject
    private LookupPickerField<Servicio> servicio_5Field;
    @Inject
    private TextField<Integer> cantidadServiciosField;
    @Inject
    private TextField<Long> dineroField;
    @Inject
    private LookupPickerField<FormaPago> formaPagoField;
    @Inject
    private LookupPickerField<Local> localField;

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

    @Subscribe("cantidadServiciosField")
    public void onCantidadServiciosFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {

        List<LookupPickerField> campo_servicios = new ArrayList<>();
        campo_servicios.add(servicio1Field);
        campo_servicios.add(servicio_2Field);
        campo_servicios.add(servicio_3Field);
        campo_servicios.add(servicio_4Field);
        campo_servicios.add(servicio_5Field);

        if (event.getValue() != null) {
            int cantidadServ = event.getValue();

            if (event.getValue() == 0) {
                //dineroField.setValue(0L);
                int aux = 4;
                for (int k = 0; k < 5; k++) {
                    campo_servicios.get(aux).clear();
                    campo_servicios.get(aux).setEnabled(false);
                    aux--;
                }
            } else if (event.getValue() > 5) {
                notifications.create().withCaption("Por favor ingrese un número entre 0 y 5").show();
                cantidadServiciosField.setValue(0);
            } else {
                for (int i = 0; i < cantidadServ; i++) {
                    campo_servicios.get(i).setEnabled(true);
                }
                for (int j = cantidadServ; j < 5; j++) {
                    campo_servicios.get(j).setEnabled(false);
                    campo_servicios.get(j).clear();
                }
            }
        } else if (event.getValue() == null) {
            notifications.create().withCaption("Por favor ingrese un número entre 0 y 5").show();
            cantidadServiciosField.setValue(0);
        }
    }

    @Subscribe("servicio1Field")
    public void onServicio1FieldValueChange(HasValue.ValueChangeEvent<Servicio> event) {
        if (localField.getValue() != null) {
            Local local = dataManager.load(Local.class)
                    .query("select l from solocejasapp_Local l where l.sede = :nombre_local")
                    .parameter("nombre_local", Objects.requireNonNull(localField.getValue().getSede()))
                    .one();
            Long valor_campo = dineroField.getValue();
            if (event.getValue() != null) {
                if (local.getSur()) {
                    if (event.getPrevValue() != null) {
                        dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur() + event.getValue().getPrecioSur());
                    } else {
                        dineroField.setValue(valor_campo + event.getValue().getPrecioSur());
                    }
                } else {
                    if (event.getPrevValue() != null) {
                        dineroField.setValue(valor_campo - event.getPrevValue().getPrecio() + event.getValue().getPrecio());
                    } else {
                        dineroField.setValue(valor_campo + event.getValue().getPrecio());
                    }
                }

            } else {
                if (local.getSur()) {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur());
                } else {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecio());
                }
            }
        }

    }

    @Subscribe("servicio_2Field")
    public void onServicio_2FieldValueChange(HasValue.ValueChangeEvent<Servicio> event) {
        if (localField.getValue() != null) {
            Local local = dataManager.load(Local.class)
                    .query("select l from solocejasapp_Local l where l.sede = :nombre_local")
                    .parameter("nombre_local", Objects.requireNonNull(localField.getValue().getSede()))
                    .one();
            Long valor_campo = dineroField.getValue();
            if (event.getValue() != null) {
                if (local.getSur()) {
                    if (event.getPrevValue() != null) {
                        dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur() + event.getValue().getPrecioSur());
                    } else {
                        dineroField.setValue(valor_campo + event.getValue().getPrecioSur());
                    }
                } else {
                    if (event.getPrevValue() != null) {
                        dineroField.setValue(valor_campo - event.getPrevValue().getPrecio() + event.getValue().getPrecio());
                    } else {
                        dineroField.setValue(valor_campo + event.getValue().getPrecio());
                    }
                }

            } else {
                if (local.getSur()) {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur());
                } else {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecio());
                }
            }
        }

    }

    @Subscribe("servicio_3Field")
    public void onServicio_3FieldValueChange(HasValue.ValueChangeEvent<Servicio> event) {
        if (localField.getValue() != null) {
            Local local = dataManager.load(Local.class)
                    .query("select l from solocejasapp_Local l where l.sede = :nombre_local")
                    .parameter("nombre_local", Objects.requireNonNull(localField.getValue().getSede()))
                    .one();
            Long valor_campo = dineroField.getValue();
            if (event.getValue() != null) {
                if (local.getSur()) {
                    if (event.getPrevValue() != null) {
                        dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur() + event.getValue().getPrecioSur());
                    } else {
                        dineroField.setValue(valor_campo + event.getValue().getPrecioSur());
                    }
                } else {
                    if (event.getPrevValue() != null) {
                        dineroField.setValue(valor_campo - event.getPrevValue().getPrecio() + event.getValue().getPrecio());
                    } else {
                        dineroField.setValue(valor_campo + event.getValue().getPrecio());
                    }
                }

            } else {
                if (local.getSur()) {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur());
                } else {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecio());
                }
            }
        }

    }

    @Subscribe("servicio_4Field")
    public void onServicio_4FieldValueChange(HasValue.ValueChangeEvent<Servicio> event) {
        Local local = dataManager.load(Local.class)
                .query("select l from solocejasapp_Local l where l.sede = :nombre_local")
                .parameter("nombre_local", Objects.requireNonNull(localField.getValue().getSede()))
                .one();
        Long valor_campo = dineroField.getValue();
        if (event.getValue() != null) {
            if (local.getSur()) {
                if (event.getPrevValue() != null) {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur() + event.getValue().getPrecioSur());
                } else {
                    dineroField.setValue(valor_campo + event.getValue().getPrecioSur());
                }
            } else {
                if (event.getPrevValue() != null) {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecio() + event.getValue().getPrecio());
                } else {
                    dineroField.setValue(valor_campo + event.getValue().getPrecio());
                }
            }

        } else {
            if (local.getSur()) {
                dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur());
            } else {
                dineroField.setValue(valor_campo - event.getPrevValue().getPrecio());
            }
        }
    }

    @Subscribe("servicio_5Field")
    public void onServicio_5FieldValueChange(HasValue.ValueChangeEvent<Servicio> event) {
        Local local = dataManager.load(Local.class)
                .query("select l from solocejasapp_Local l where l.sede = :nombre_local")
                .parameter("nombre_local", Objects.requireNonNull(localField.getValue().getSede()))
                .one();
        Long valor_campo = dineroField.getValue();
        if (event.getValue() != null) {
            if (local.getSur()) {
                if (event.getPrevValue() != null) {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur() + event.getValue().getPrecioSur());
                } else {
                    dineroField.setValue(valor_campo + event.getValue().getPrecioSur());
                }
            } else {
                if (event.getPrevValue() != null) {
                    dineroField.setValue(valor_campo - event.getPrevValue().getPrecio() + event.getValue().getPrecio());
                } else {
                    dineroField.setValue(valor_campo + event.getValue().getPrecio());
                }
            }

        } else {
            if (local.getSur()) {
                dineroField.setValue(valor_campo - event.getPrevValue().getPrecioSur());
            } else {
                dineroField.setValue(valor_campo - event.getPrevValue().getPrecio());
            }
        }
    }

    @Subscribe("localField")
    public void onLocalFieldValueChange(HasValue.ValueChangeEvent<Local> event) {
        if (event.getValue() != null) {
            dineroField.setEnabled(true);
            cantidadServiciosField.setEnabled(true);
            formaPagoField.setValue(dataManager.loadValue("select f from solocejasapp_FormaPago f where f.tipo = 'Efectivo'", FormaPago.class).one());

        } else {
            cantidadServiciosField.setEnabled(false);
            dineroField.setEnabled(false);
            cantidadServiciosField.setValue(0);
            dineroField.setValue(0L);
        }
    }

    @Subscribe("numeroVentaField")
    public void onNumeroVentaFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {
        dineroField.setValue(0L);
        User usuario = userSession.getUser();
        String pos = usuario.getPosition();
        if (pos != null) {
            localField.setValue(dataManager
                    .loadValue("select l from solocejasapp_Local l where l.sede = :posicion", Local.class)
                    .parameter("posicion", pos)
                    .one());
        }
    }

}
package com.company.solocejasapp.web.screens.servicio;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Servicio;

@UiController("solocejasapp_Servicio.edit")
@UiDescriptor("servicio-edit.xml")
@EditedEntityContainer("servicioDc")
@LoadDataBeforeShow
public class ServicioEdit extends StandardEditor<Servicio> {
}
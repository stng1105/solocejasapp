package com.company.solocejasapp.web.screens.servicio;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Servicio;

@UiController("solocejasapp_Servicio.browse")
@UiDescriptor("servicio-browse.xml")
@LookupComponent("serviciosTable")
@LoadDataBeforeShow
public class ServicioBrowse extends StandardLookup<Servicio> {
}
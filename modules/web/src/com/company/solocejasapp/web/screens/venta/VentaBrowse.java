package com.company.solocejasapp.web.screens.venta;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Venta;

@UiController("solocejasapp_Venta.browse")
@UiDescriptor("venta-browse.xml")
@LookupComponent("ventasTable")
@LoadDataBeforeShow
public class VentaBrowse extends StandardLookup<Venta> {
}
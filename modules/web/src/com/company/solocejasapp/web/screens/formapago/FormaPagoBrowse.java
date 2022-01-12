package com.company.solocejasapp.web.screens.formapago;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.FormaPago;

@UiController("solocejasapp_FormaPago.browse")
@UiDescriptor("forma-pago-browse.xml")
@LookupComponent("formaPagoesTable")
@LoadDataBeforeShow
public class FormaPagoBrowse extends StandardLookup<FormaPago> {
}
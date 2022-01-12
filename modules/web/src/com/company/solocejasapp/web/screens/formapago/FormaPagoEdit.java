package com.company.solocejasapp.web.screens.formapago;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.FormaPago;

@UiController("solocejasapp_FormaPago.edit")
@UiDescriptor("forma-pago-edit.xml")
@EditedEntityContainer("formaPagoDc")
@LoadDataBeforeShow
public class FormaPagoEdit extends StandardEditor<FormaPago> {
}
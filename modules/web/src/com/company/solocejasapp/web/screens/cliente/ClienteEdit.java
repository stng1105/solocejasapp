package com.company.solocejasapp.web.screens.cliente;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Cliente;

@UiController("solocejasapp_Cliente.edit")
@UiDescriptor("cliente-edit.xml")
@EditedEntityContainer("clienteDc")
@LoadDataBeforeShow
public class ClienteEdit extends StandardEditor<Cliente> {
}
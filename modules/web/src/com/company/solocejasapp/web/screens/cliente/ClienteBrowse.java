package com.company.solocejasapp.web.screens.cliente;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Cliente;

@UiController("solocejasapp_Cliente.browse")
@UiDescriptor("cliente-browse.xml")
@LookupComponent("clientesTable")
@LoadDataBeforeShow
public class ClienteBrowse extends StandardLookup<Cliente> {
}
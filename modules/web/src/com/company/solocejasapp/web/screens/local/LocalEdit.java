package com.company.solocejasapp.web.screens.local;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Local;

@UiController("solocejasapp_Local.edit")
@UiDescriptor("local-edit.xml")
@EditedEntityContainer("localDc")
@LoadDataBeforeShow
public class LocalEdit extends StandardEditor<Local> {
}
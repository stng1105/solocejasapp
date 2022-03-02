package com.company.solocejasapp.web.screens.reporte;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Reporte;

@UiController("solocejasapp_Reporte.edit")
@UiDescriptor("reporte-edit.xml")
@EditedEntityContainer("reporteDc")
@LoadDataBeforeShow
public class ReporteEdit extends StandardEditor<Reporte> {
}
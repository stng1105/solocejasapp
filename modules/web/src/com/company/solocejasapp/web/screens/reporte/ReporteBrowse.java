package com.company.solocejasapp.web.screens.reporte;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Reporte;

@UiController("solocejasapp_Reporte.browse")
@UiDescriptor("reporte-browse.xml")
@LookupComponent("reportesTable")
@LoadDataBeforeShow
public class ReporteBrowse extends StandardLookup<Reporte> {
}
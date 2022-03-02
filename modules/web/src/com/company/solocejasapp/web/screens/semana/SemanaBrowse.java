package com.company.solocejasapp.web.screens.semana;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Semana;

@UiController("solocejasapp_Semana.browse")
@UiDescriptor("semana-browse.xml")
@LookupComponent("semanasTable")
@LoadDataBeforeShow
public class SemanaBrowse extends StandardLookup<Semana> {
}
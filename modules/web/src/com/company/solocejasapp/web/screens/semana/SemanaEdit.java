package com.company.solocejasapp.web.screens.semana;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Semana;

@UiController("solocejasapp_Semana.edit")
@UiDescriptor("semana-edit.xml")
@EditedEntityContainer("semanaDc")
@LoadDataBeforeShow
public class SemanaEdit extends StandardEditor<Semana> {
}
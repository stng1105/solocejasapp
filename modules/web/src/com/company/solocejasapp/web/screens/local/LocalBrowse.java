package com.company.solocejasapp.web.screens.local;

import com.haulmont.cuba.gui.screen.*;
import com.company.solocejasapp.entity.Local;

@UiController("solocejasapp_Local.browse")
@UiDescriptor("local-browse.xml")
@LookupComponent("localsTable")
@LoadDataBeforeShow
public class LocalBrowse extends StandardLookup<Local> {
}
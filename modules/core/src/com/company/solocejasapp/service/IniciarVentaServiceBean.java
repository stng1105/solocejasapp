package com.company.solocejasapp.service;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.UserSessionSource;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;
import java.util.TimeZone;

@Service(IniciarVentaService.NAME)
public class IniciarVentaServiceBean implements IniciarVentaService {

    @Inject
    private DataManager dataManager;
    @Inject
    private UserSessionSource userSessionSource;

    @Override
    public Date valoresIniciales() {
        //TimeZone.setDefault(TimeZone.getTimeZone("GMT-5"));
        return (new Date());
    }
}
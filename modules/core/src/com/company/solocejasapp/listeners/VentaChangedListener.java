package com.company.solocejasapp.listeners;

import com.company.solocejasapp.entity.Venta;

import java.util.UUID;

import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component("solocejasapp_VentaChangedListener")
public class VentaChangedListener {

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<Venta, UUID> event) {

    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void afterCommit(EntityChangedEvent<Venta, UUID> event) {

    }
}
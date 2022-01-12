package com.company.solocejasapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.util.Date;

@Table(name = "SOLOCEJASAPP_VENTA")
@Entity(name = "solocejasapp_Venta")
@NamePattern("%s|numeroVenta")
@Listeners("solocejasapp_VentaListener")
public class Venta extends StandardEntity {
    private static final long serialVersionUID = 3469961873829296784L;

    @Column(name = "NUMERO_VENTA", unique = true)
    private Integer numeroVenta;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA")
    private Date fecha;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VENDEDORA_ID")
    private User vendedora;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOCAL_ID")
    private Local local;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENTE_ID")
    private Cliente cliente;

    @NumberFormat(pattern = "#,##0.#")
    @Column(name = "DINERO")
    private Long dinero;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FORMA_PAGO_ID")
    private FormaPago formaPago;

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Long getDinero() {
        return dinero;
    }

    public void setDinero(Long dinero) {
        this.dinero = dinero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public User getVendedora() {
        return vendedora;
    }

    public void setVendedora(User vendedora) {
        this.vendedora = vendedora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(Integer numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
}
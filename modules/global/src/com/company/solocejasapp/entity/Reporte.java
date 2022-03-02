package com.company.solocejasapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.util.Date;

@Table(name = "SOLOCEJASAPP_REPORTE")
@Entity(name = "solocejasapp_Reporte")
@NamePattern("%s|fecha")
public class Reporte extends StandardEntity {
    private static final long serialVersionUID = 8590380280848543839L;

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

    @Column(name = "NUMERO_SERVICIOS")
    private Integer numeroServicios;

    @NumberFormat(pattern = "#,##0.#")
    @Column(name = "DINERO_VENTAS")
    private Long dineroVentas;

    @Column(name = "PESTANAS")
    private Integer pestanas;

    @Column(name = "ACEITES")
    private Integer aceites;

    @NumberFormat(pattern = "#,##0.#")
    @Column(name = "NOMINA")
    private Long nomina;

    @Column(name = "SEMANA")
    private Integer semana;

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

    public Integer getNumeroServicios() {
        return numeroServicios;
    }

    public void setNumeroServicios(Integer numeroServicios) {
        this.numeroServicios = numeroServicios;
    }

    public Long getDineroVentas() {
        return dineroVentas;
    }

    public void setDineroVentas(Long dineroVentas) {
        this.dineroVentas = dineroVentas;
    }

    public Integer getPestanas() {
        return pestanas;
    }

    public void setPestanas(Integer pestanas) {
        this.pestanas = pestanas;
    }

    public Integer getAceites() {
        return aceites;
    }

    public void setAceites(Integer aceites) {
        this.aceites = aceites;
    }

    public Long getNomina() {
        return nomina;
    }

    public void setNomina(Long nomina) {
        this.nomina = nomina;
    }

    public Integer getSemana() {
        return semana;
    }

    public void setSemana(Integer semana) {
        this.semana = semana;
    }
}
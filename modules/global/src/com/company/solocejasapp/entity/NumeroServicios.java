package com.company.solocejasapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "SOLOCEJASAPP_NUMERO_SERVICIOS")
@Entity(name = "solocejasapp_NumeroServicios")
@NamePattern("%s|numeroServicios")
public class NumeroServicios extends StandardEntity {
    private static final long serialVersionUID = -7355644451206399812L;

    @Column(name = "NUMERO_SERVICIOS")
    private Integer numeroServicios;

    public Integer getNumeroServicios() {
        return numeroServicios;
    }

    public void setNumeroServicios(Integer numeroServicios) {
        this.numeroServicios = numeroServicios;
    }
}
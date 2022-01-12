package com.company.solocejasapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "SOLOCEJASAPP_FORMA_PAGO")
@Entity(name = "solocejasapp_FormaPago")
@NamePattern("%s|tipo")
public class FormaPago extends StandardEntity {
    private static final long serialVersionUID = -4500247558160863779L;

    @Column(name = "TIPO")
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
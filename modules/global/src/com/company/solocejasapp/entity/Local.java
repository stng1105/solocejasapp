package com.company.solocejasapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "SOLOCEJASAPP_LOCAL")
@Entity(name = "solocejasapp_Local")
@NamePattern("%s|sede")
public class Local extends StandardEntity {
    private static final long serialVersionUID = -5877256576074072163L;

    @Column(name = "SEDE", nullable = false, unique = true)
    @NotNull
    private String sede;

    @Column(name = "SUR")
    private Boolean sur;

    public Boolean getSur() {
        return sur;
    }

    public void setSur(Boolean sur) {
        this.sur = sur;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
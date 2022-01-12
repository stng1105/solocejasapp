package com.company.solocejasapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "SOLOCEJASAPP_CLIENTE")
@Entity(name = "solocejasapp_Cliente")
@NamePattern("%s|identificacion")
public class Cliente extends StandardEntity {
    private static final long serialVersionUID = -4268094517702760423L;

    @NotNull
    @Column(name = "IDENTIFICACION", nullable = false, unique = true)
    private String identificacion;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "EMAIL")
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
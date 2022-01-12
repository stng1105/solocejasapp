package com.company.solocejasapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "SOLOCEJASAPP_SERVICIO")
@Entity(name = "solocejasapp_Servicio")
@NamePattern("%s|nombre")
public class Servicio extends StandardEntity {
    private static final long serialVersionUID = 260251899406760329L;

    @Column(name = "CODIGO", nullable = false, unique = true)
    @NotNull
    private Integer codigo;

    @Column(name = "NOMBRE")
    private String nombre;

    @NumberFormat(pattern = "#,##0.##")
    @Column(name = "PRECIO")
    private Long precio;

    @NumberFormat(pattern = "#,##0.##")
    @Column(name = "PRECIO_SUR")
    private Integer precioSur;

    public Integer getPrecioSur() {
        return precioSur;
    }

    public void setPrecioSur(Integer precioSur) {
        this.precioSur = precioSur;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
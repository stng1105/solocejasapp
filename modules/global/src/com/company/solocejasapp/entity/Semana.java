package com.company.solocejasapp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import javax.persistence.*;
import java.util.Date;

@Table(name = "SOLOCEJASAPP_SEMANA")
@Entity(name = "solocejasapp_Semana")
public class Semana extends StandardEntity {
    private static final long serialVersionUID = -8264386316761788696L;

    @Column(name = "NUMERO_SEMANA")
    private Integer numeroSemana;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INICIO")
    private DateTime inicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FIN")
    private DateTime fin;

    public Integer getNumeroSemana() {
        return numeroSemana;
    }

    public void setNumeroSemana(Integer numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

    public DateTime getInicio() {
        return inicio;
    }

    public void setInicio(DateTime inicio) {
        this.inicio = inicio;
    }

    public DateTime getFin() {
        return fin;
    }

    public void setFin(DateTime fin) {
        this.fin = fin;
    }
}
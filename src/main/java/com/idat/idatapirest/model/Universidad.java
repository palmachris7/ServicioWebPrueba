package com.idat.idatapirest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "universidads")
@Entity
public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUniversidad;
    private String Universidad;
    @OneToOne(mappedBy = "universidads")
    private Malla malla;

    public Integer getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }

    public Malla getMalla() {
        return malla;
    }

    public void setMalla(Malla malla) {
        this.malla = malla;
    }
}
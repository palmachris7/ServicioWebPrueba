package com.idat.idatapirest.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "mallas")
@Entity
public class Malla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMalla;
    private String año;

    @OneToOne
    @JoinColumn(name="id_universidad", nullable = false, unique = true,
            foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_universidad) references universidads (id_universidad)"))
    private Universidad universidads;

    @OneToMany(mappedBy = "mallas")
    private List<Curso> cursos = new ArrayList<>();

    public Integer getIdMalla() {
        return idMalla;
    }

    public void setIdMalla(Integer idMalla) {
        this.idMalla = idMalla;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Universidad getUniversidads() {
        return universidads;
    }

    public void setUniversidads(Universidad universidads) {
        this.universidads = universidads;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
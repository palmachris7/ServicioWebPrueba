package com.idat.idatapirest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Table(name="cursos")
@Entity
public class Curso implements Serializable{



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;
	private String descripcion;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="profesor_curso",
			joinColumns = @JoinColumn(name="id_curso", nullable = false, unique = true,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_curso) references cursos (id_curso)")),
			inverseJoinColumns =  @JoinColumn(name="id_profesor", nullable = false, unique = true,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_profesor) references profesors (id_profesor)"))
	)
	private List<Profesor> profesors = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name="id_malla", nullable = false, unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_malla) references mallas (id_malla)"))
	private Malla mallas;


	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Profesor> getProfesors() {
		return profesors;
	}

	public void setProfesors(List<Profesor> profesors) {
		this.profesors = profesors;
	}

	public Malla getMallas() {
		return mallas;
	}

	public void setMallas(Malla mallas) {
		this.mallas = mallas;
	}
}
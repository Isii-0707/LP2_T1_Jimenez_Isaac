package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_especialidad")
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especialidad")
	@EqualsAndHashCode.Include
	private Integer idEspecialidad;

	@Column(name = "titulo")
	private String titulo;
	
	@Override
	public String toString() {
		return titulo;
	}

}
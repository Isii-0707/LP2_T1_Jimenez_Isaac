package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Dentista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dentista")
	@EqualsAndHashCode.Include
	private Integer idDentista;

	@Column(name = "cop")
	private String cop;

	@Column(name = "nombre_completo")
	private String nombreCompleto;

	@Column(name = "fecha_inicio_contrato")
	private LocalDate fechaInicioContrato;

	@Column(name = "turno")
	private String turno;

	@Column(name = "correo")
	private String correo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_especialidad")
	private Especialidad especialidad;

	public String getTurnoDescripcion() {

		switch (turno) {
		case "M":
			return "Mañana";

		case "T":
			return "Tarde";

		case "N":
			return "Noche";

		default:
			return "Desconocido";
		}
	}

	@Override
	public String toString() {
		return nombreCompleto;
	}

}
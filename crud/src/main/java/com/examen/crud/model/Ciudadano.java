package com.examen.crud.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ciudadanos")
public class Ciudadano {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	public Ciudadano() {

	}

	public Ciudadano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
    
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_id", referencedColumnName = "id")
	private Domicilio domicilio;


}
package com.examen.crud.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "domicilios")
public class Domicilio {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private long id;

	@Column(name = "calle")
	private String calle;

	@Column(name = "ciudad")
	private String ciudad;

	@Column(name = "cp")
	private int cp;
	
	public Domicilio() {

	}
	public Domicilio(String calle, String ciudad, int cp) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.cp = cp;
	}
	
	//@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "ciudadano_id")
    //private Ciudadano ciudadano;


}
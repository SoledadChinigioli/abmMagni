package com.example.demo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Empresa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int id;
	private String denominacion;
	private String telefono;
	private String horarioAtencion;
	private String quienesSomos;
	private float latitud;
	private float longitud;
	private String domicilio;
	private String email;
	
	@OneToMany (mappedBy = "Empresa")//(cascade = CascadeType.ALL)
	private List<Noticias> noticias = new ArrayList();
	//private Noticias noticias;
	
	
	public Empresa () {
		super();
	}


	public Empresa(int id,String denominacion, String telefono, String horarioAtencion, String quienesSomos,
			float latitud, float longitud, String domicilio, String email) {
		
		this.id = id;
		this.denominacion = denominacion;
		this.telefono = telefono;
		this.horarioAtencion = horarioAtencion;
		this.quienesSomos = quienesSomos;
		this.latitud = latitud;
		this.longitud = longitud;
		this.domicilio = domicilio;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getHorarioAtencion() {
		return horarioAtencion;
	}


	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}


	public String getQuienesSomos() {
		return quienesSomos;
	}


	public void setQuienesSomos(String quienesSomos) {
		this.quienesSomos = quienesSomos;
	}


	public float getLatitud() {
		return latitud;
	}


	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}


	public float getLongitud() {
		return longitud;
	}


	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	
	

}

package com.example.demo.dtos;

import java.sql.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.entidades.Empresa;

public class NoticiasDto {
	
	private int id;
	private String tituloNoticia;
	private String resumen;
	private String imagen;
	private String contenidoHtml;
	private char publicada;
	private Date fechaPublicacion;
	private int idEmpresa;
	
	@ManyToOne
	@JoinColumn(name="noticias Empresa")
	private Empresa empresa;
	

	public NoticiasDto() {
		super();
	}

	public NoticiasDto(String tituloNoticia, String resumen, String imagen, String contenidoHtml, char publicada,
			Date fechaPublicacion, int idEmpresa) {
		super();
		this.tituloNoticia = tituloNoticia;
		this.resumen = resumen;
		this.imagen = imagen;
		this.contenidoHtml = contenidoHtml;
		this.publicada = publicada;
		this.fechaPublicacion = fechaPublicacion;
		this.idEmpresa = idEmpresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTituloNoticia() {
		return tituloNoticia;
	}

	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getContenidoHtml() {
		return contenidoHtml;
	}

	public void setContenidoHtml(String contenidoHtml) {
		this.contenidoHtml = contenidoHtml;
	}

	public char getPublicada() {
		return publicada;
	}

	public void setPublicada(char publicada) {
		this.publicada = publicada;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	
}

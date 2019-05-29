package cl.azurian.consultalista.dto;

import java.io.Serializable;

import javax.persistence.Entity;

public class ListaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 413260371577703950L;
	
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private int edad;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}

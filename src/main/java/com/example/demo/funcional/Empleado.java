package com.example.demo.funcional;

import java.math.BigDecimal;

public class Empleado {
	private String nombreCompleto;
	private String pais;
	
	//Getters and Setters
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Empleado [nombreCompleto=" + nombreCompleto + ", pais=" + pais + "]";
	}
	
	
	
}

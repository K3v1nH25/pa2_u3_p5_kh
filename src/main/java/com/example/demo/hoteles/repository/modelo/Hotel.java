package com.example.demo.hoteles.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hotel")
	@SequenceGenerator(name = "seq_hotel", sequenceName = "seq_hotel", allocationSize = 1)
	@Column(name = "hote_id")
	private Integer id;

	@Column(name = "hote_nombre")
	private String nombre;

	@Column(name = "hote_direccion")
	private String direccion;

	@Column(name = "hote_categoria")
	private String categoria;

	@Column(name = "hote_numero_habitaciones")
	private String numeroHabitaciones;

	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Habitacion> habitaciones;

	// Getters and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(String numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", categoria=" + categoria
				+ ", numeroHabitaciones=" + numeroHabitaciones + ", habitaciones=" + habitaciones + "]";
	}

}

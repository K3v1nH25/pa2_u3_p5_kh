package com.example.demo.hoteles.repositor;

import java.util.List;

import com.example.demo.hoteles.repository.modelo.Hotel;

public interface IHotelRepository {

	public Hotel seleccionar(Integer id);

	public void insertar(Hotel hotel);

	public List<Hotel> seleccionarPorNombreInner(String nombre);

	public List<Hotel> seleccionarPorDireccionLeft(String direccion);

	public List<Hotel> seleccionarPorCategoriaRigth(String categoria);

	public List<Hotel> seleccionarPorNumeroHabitacionesFull(String numeroHabitaciones);

	public List<Hotel> seleccionarPorNombreFetch(String nombre);

	public List<Hotel> seleccionarPorDireccionInner(String direccion);

	public List<Hotel> seleccionarPorCategoriaLeft(String categoria);

	public List<Hotel> seleccionarPorNumeroHabitacionesRight(String numeroHabitaciones);

	public List<Hotel> seleccionarPorNombreFull(String nombre);

	public List<Hotel> seleccionarPorDireccionFetch(String direccion);

}

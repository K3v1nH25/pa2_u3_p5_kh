package com.example.demo.hoteles.repositor;

import java.util.List;

import com.example.demo.hoteles.repository.modelo.Hotel;

public interface IHotelRepository {

	public Hotel seleccionar(Integer id);

	public void insertar(Hotel hotel);

	public List<Hotel> seleccionarPorNombre(String nombre);

	public List<Hotel> seleccionarPorDireccion(String direccion);

	public List<Hotel> seleccionarPorCategoria(String categoria);

	public List<Hotel> seleccionarPorNumeroHabitaciones(String numeroHabitaciones);

}

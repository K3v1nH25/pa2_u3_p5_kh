package com.example.demo.hoteles.service;

import java.util.List;

import com.example.demo.hoteles.repository.modelo.Hotel;

public interface IHotelService {

	public Hotel buscar(Integer id);

	public void guardar(Hotel hotel);

	public List<Hotel> buscarPorNombre(String nombre);

	public List<Hotel> buscarPorDireccion(String direccion);

	public List<Hotel> buscarPorCategoria(String categoria);

	public List<Hotel> buscarPorNumeroHabitaciones(String numeroHabitaciones);

}

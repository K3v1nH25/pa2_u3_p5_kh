package com.example.demo.hoteles.service;

import java.util.List;

import com.example.demo.hoteles.repository.modelo.Hotel;

public interface IHotelService {

	public Hotel buscar(Integer id);

	public void guardar(Hotel hotel);

	public List<Hotel> buscarPorNombreInner(String nombre);

	public List<Hotel> buscarPorDireccionLeft(String direccion);

	public List<Hotel> buscarPorCategoriaRigth(String categoria);

	public List<Hotel> buscarPorNumeroHabitacionesFull(String numeroHabitaciones);

	public List<Hotel> buscarPorNombreFetch(String nombre);

	public List<Hotel> buscarPorDireccionInner(String direccion);

	public List<Hotel> buscarPorCategoriaLeft(String categoria);

	public List<Hotel> buscarPorNumeroHabitacionesRight(String numeroHabitaciones);

	public List<Hotel> buscarPorNombreFull(String nombre);

	public List<Hotel> buscarPorDireccionFetch(String direccion);

}

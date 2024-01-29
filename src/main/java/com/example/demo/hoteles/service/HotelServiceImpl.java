package com.example.demo.hoteles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hoteles.repositor.IHotelRepository;
import com.example.demo.hoteles.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository iHotelRepository;

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.iHotelRepository.insertar(hotel);

	}

	@Override
	public List<Hotel> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public List<Hotel> buscarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorDireccion(direccion);
	}

	@Override
	public List<Hotel> buscarPorCategoria(String categoria) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorCategoria(categoria);
	}

	@Override
	public List<Hotel> buscarPorNumeroHabitaciones(String numeroHabitaciones) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorNumeroHabitaciones(numeroHabitaciones);
	}

}

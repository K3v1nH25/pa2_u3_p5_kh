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
	public List<Hotel> buscarPorNombreInner(String nombre) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorNombreInner(nombre);
	}

	@Override
	public List<Hotel> buscarPorDireccionLeft(String direccion) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorDireccionLeft(direccion);
	}

	@Override
	public List<Hotel> buscarPorCategoriaRigth(String categoria) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorCategoriaRigth(categoria);
	}

	@Override
	public List<Hotel> buscarPorNumeroHabitacionesFull(String numeroHabitaciones) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorNumeroHabitacionesFull(numeroHabitaciones);
	}

	@Override
	public List<Hotel> buscarPorNombreFetch(String nombre) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorNombreFetch(nombre);
	}

	@Override
	public List<Hotel> buscarPorDireccionInner(String direccion) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorDireccionInner(direccion);
	}

	@Override
	public List<Hotel> buscarPorCategoriaLeft(String categoria) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorCategoriaLeft(categoria);
	}

	@Override
	public List<Hotel> buscarPorNumeroHabitacionesRight(String numeroHabitaciones) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorNumeroHabitacionesRight(numeroHabitaciones);
	}

	@Override
	public List<Hotel> buscarPorNombreFull(String nombre) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorNombreFull(nombre);
	}

	@Override
	public List<Hotel> buscarPorDireccionFetch(String direccion) {
		// TODO Auto-generated method stub
		return this.iHotelRepository.seleccionarPorDireccionFetch(direccion);
	}

}

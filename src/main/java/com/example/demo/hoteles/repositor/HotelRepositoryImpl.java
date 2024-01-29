package com.example.demo.hoteles.repositor;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hoteles.repository.modelo.Hotel;
import com.example.demo.ventas.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);

	}

	@Override
	public List<Hotel> seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones b WHERE h.nombre =:nombre", Hotel.class);
		myQuery.setParameter("nombre", nombre);
		List<Hotel> lista = myQuery.getResultList();
		for (Hotel h : lista) {
			h.getHabitaciones().size();
		}
		return lista;

	}

	@Override
	public List<Hotel> seleccionarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h LEFT JOIN h.habitaciones b WHERE h.direccion =:direccion", Hotel.class);
		myQuery.setParameter("direccion", direccion);
		List<Hotel> lista = myQuery.getResultList();
		for (Hotel h : lista) {
			h.getHabitaciones().size();
		}
		return lista;
	}

	@Override
	public List<Hotel> seleccionarPorCategoria(String categoria) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h RIGHT JOIN h.habitaciones b WHERE h.categoria =:categoria", Hotel.class);
		myQuery.setParameter("categoria", categoria);
		List<Hotel> lista = myQuery.getResultList();
		for (Hotel h : lista) {
			h.getHabitaciones().size();
		}
		return lista;
	}

	@Override
	public List<Hotel> seleccionarPorNumeroHabitaciones(String numeroHabitaciones) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h FULL JOIN h.habitaciones b WHERE h.numeroHabitaciones =:numeroHabitaciones",
				Hotel.class);
		myQuery.setParameter("numeroHabitaciones", numeroHabitaciones);
		List<Hotel> lista = myQuery.getResultList();
		for (Hotel h : lista) {
			h.getHabitaciones().size();
		}
		return lista;
	}

}

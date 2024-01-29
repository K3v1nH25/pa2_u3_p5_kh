package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hoteles.repository.modelo.Hotel;
import com.example.demo.hoteles.service.IHotelService;

@SpringBootApplication
public class Pa2U3P5KhApplication implements CommandLineRunner {

	@Autowired
	private IHotelService iHotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Hotel hotel = new Hotel(); hotel.setNombre("La catedral");
		 * hotel.setDireccion("Centro de Quito"); hotel.setCategoria("3 estrellas");
		 * hotel.setNumeroHabitaciones("40");
		 * 
		 * Habitacion habitacion = new Habitacion();
		 * habitacion.setClase("Presidencial"); habitacion.setNumero("A1");
		 * habitacion.setHotel(hotel);
		 * 
		 * Habitacion habitacion2 = new Habitacion(); habitacion2.setClase("Estandar");
		 * habitacion2.setNumero("C1"); habitacion2.setHotel(hotel);
		 * 
		 * Habitacion habitacion3 = new Habitacion(); habitacion3.setClase("Dobles");
		 * habitacion3.setNumero("C1"); habitacion3.setHotel(hotel);
		 * 
		 * List<Habitacion> habitacions = new ArrayList<>();
		 * habitacions.add(habitacion); habitacions.add(habitacion2);
		 * habitacions.add(habitacion3);
		 * 
		 * hotel.setHabitaciones(habitacions); this.iHotelService.guardar(hotel);
		 */

		System.out.println("INNER JOIN");
		List<Hotel> lista = this.iHotelService.buscarPorNombre("La catedral");
		for (Hotel h : lista) {
			System.out.println(h.getHabitaciones());
		}
		System.out.println("LEFT JOIN");
		List<Hotel> lista2 = this.iHotelService.buscarPorDireccion("Centro de Quito");
		for (Hotel h : lista2) {
			System.out.println(h.getHabitaciones());
		}
		System.out.println("RIGHT JOIN");
		List<Hotel> lista3 = this.iHotelService.buscarPorCategoria("3 estrellas");
		for (Hotel h : lista3) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("FULL JOIN");
		List<Hotel> lista4 = this.iHotelService.buscarPorNumeroHabitaciones("40");
		for (Hotel h : lista4) {
			System.out.println(h.getHabitaciones());
		}

	}

}

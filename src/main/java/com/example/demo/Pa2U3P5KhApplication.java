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

		System.out.println("INNER JOIN");
		List<Hotel> lista = this.iHotelService.buscarPorNombreInner("La catedral");
		for (Hotel h : lista) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("INNER JOIN");
		List<Hotel> lista2 = this.iHotelService.buscarPorDireccionInner("Centro de Quito");
		for (Hotel h : lista2) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("LEFT JOIN");
		List<Hotel> lista3 = this.iHotelService.buscarPorDireccionLeft("Centro de Quito");
		for (Hotel h : lista3) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("LEFT JOIN");
		List<Hotel> lista4 = this.iHotelService.buscarPorCategoriaLeft("3 estrellas");
		for (Hotel h : lista4) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("RIGTH JOIN");
		List<Hotel> lista5 = this.iHotelService.buscarPorCategoriaRigth("3 estrellas");
		for (Hotel h : lista5) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("RIGTH JOIN");
		List<Hotel> lista6 = this.iHotelService.buscarPorNumeroHabitacionesRight("40");
		for (Hotel h : lista6) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("FULL JOIN");
		List<Hotel> lista7 = this.iHotelService.buscarPorNumeroHabitacionesFull("40");
		for (Hotel h : lista7) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("FULL JOIN");
		List<Hotel> lista8 = this.iHotelService.buscarPorNombreFull("La catedral");
		for (Hotel h : lista8) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("FETCH JOIN");
		List<Hotel> lista9 = this.iHotelService.buscarPorNombreFetch("La catedral");
		for (Hotel h : lista9) {
			System.out.println(h.getHabitaciones());
		}

		System.out.println("FETCH JOIN");
		List<Hotel> lista10 = this.iHotelService.buscarPorDireccionFetch("Centro de Quito");
		for (Hotel h : lista10) {
			System.out.println(h.getHabitaciones());
		}

	}
}

package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.DetalleFactura;
import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5KhApplication implements CommandLineRunner {

	@Autowired
	private IFacturaService iFacturaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		Factura fact = new Factura();
//		fact.setCedula("17505");
//		fact.setFecha(LocalDateTime.now());
//		fact.setNumero("0002-17172");
//
//		DetalleFactura det1 = new DetalleFactura();
//		det1.setCantidad(15);
//		det1.setCodigoBarras("7878");
//		det1.setFactura(fact);
//		det1.setNombreProducto("Azucar");
//
//		DetalleFactura det2 = new DetalleFactura();
//		det2.setCantidad(10);
//		det2.setCodigoBarras("9669");
//		det2.setFactura(fact);
//		det2.setNombreProducto("Sal");
//
//		DetalleFactura det3 = new DetalleFactura();
//		det3.setCantidad(5);
//		det3.setCodigoBarras("5858");
//		det3.setFactura(fact);
//		det3.setNombreProducto("Agua");
//
//		List<DetalleFactura> listaDetalle = new ArrayList<>();
//		listaDetalle.add(det1);
//		listaDetalle.add(det2);
//		listaDetalle.add(det3);
//
//		fact.setDetalleFactura(listaDetalle);
//		this.iFacturaService.guardar(fact);

		System.out.println("UPDATE");
		int lista = this.iFacturaService.actualizarFechas(LocalDateTime.of(2020, 1, 9, 12, 50),
				LocalDateTime.of(2024, 1, 29, 20, 47));
		System.out.println(lista);

		System.out.println("DELETE");
		int lista2 = this.iFacturaService.borrarPorNumero("0001-34512");
		System.out.println(lista2);

		// this.iFacturaService.borrar(3);

		// DTO: data Transfer Object -Patron de diseño
		System.out.println("DTO");
		List<FacturaDTO> listaDTO = this.iFacturaService.buscarFcaturasDTO();
		for (FacturaDTO fDto : listaDTO) {
			System.out.println(fDto);
		}

	}
}

package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.DetalleFactura;
import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5KhApplication implements CommandLineRunner {

	@Autowired
	private IFacturaService iFacturaService;

	// Join Types en Jakarta Persisten
	// 1. Join
	// 1.1 INNER JOIN
	// 1.2 OUTER JOIN
	// 1.2.1 RIGTH
	// 1.2.2 LEFT
	// 1.2.3 FUL
	// 2. Join WHERE
	// 3. FETCH JOIN

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("INNER JOIN");
		List<Factura> lista = this.iFacturaService.buscarInnerJoin();
		for (Factura f : lista) {
			System.out.println(f);
		}

		System.out.println("RIGTH JOIN");
		List<Factura> lista2 = this.iFacturaService.buscarFacturasRightJoin();
		for (Factura f : lista2) {
			System.out.println(f.getNumero());
		}
		System.out.println("LEFT JOIN");
		List<Factura> lista3 = this.iFacturaService.buscarFacturasLeftJoin();
		for (Factura f : lista3) {
			System.out.println(f);
		}

		System.out.println("FULL JOIN");
		List<Factura> lista4 = this.iFacturaService.buscarFacturasFullJoin();
		for (Factura f : lista4) {
			System.out.println(f);
			for (DetalleFactura d : f.getDetalleFactura()) {
				System.out.println(d);
			}
		}
	}
}

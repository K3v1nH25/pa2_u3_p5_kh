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

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Factura fact = new Factura(); fact.setCedula("17244");
		 * fact.setFecha(LocalDateTime.now()); fact.setNumero("0001-34512");
		 * 
		 * DetalleFactura det1 = new DetalleFactura(); det1.setCantidad(20);
		 * det1.setCodigoBarras("121212"); det1.setFactura(fact);
		 * det1.setNombreProducto("Crema de leche");
		 * 
		 * DetalleFactura det2 = new DetalleFactura(); det2.setCantidad(15);
		 * det2.setCodigoBarras("323232"); det2.setFactura(fact);
		 * det2.setNombreProducto("Fideos");
		 * 
		 * DetalleFactura det3 = new DetalleFactura(); det3.setCantidad(30);
		 * det3.setCodigoBarras("454545"); det3.setFactura(fact);
		 * det3.setNombreProducto("Canguil");
		 * 
		 * List<DetalleFactura> listaDetalle = new ArrayList<>();
		 * listaDetalle.add(det1); listaDetalle.add(det2); listaDetalle.add(det3);
		 * 
		 * fact.setDetalleFactura(listaDetalle); this.iFacturaService.guardar(fact);
		 */

		System.out.println("INNER JOIN");
		List<Factura> lista = this.iFacturaService.buscarInnerJoin();
		for (Factura f : lista) {
			System.out.println(f.getNumero());
			for (DetalleFactura d : f.getDetalleFactura()) {
				System.out.println(d.getNombreProducto());
			}
		}

		System.out.println("WHERE JOIN");
		List<Factura> lista2 = this.iFacturaService.buscarFacturasWhereJoin();
		for (Factura f : lista2) {
			System.out.println(f.getNumero());
			for (DetalleFactura d : f.getDetalleFactura()) {
				System.out.println(d.getNombreProducto());
			}

		}

		System.out.println("FETCH JOIN");
		List<Factura> lista3 = this.iFacturaService.buscarFacturasFetchJoin();
		for (Factura f : lista3) {
			System.out.println(f.getNumero());
			for (DetalleFactura d : f.getDetalleFactura()) {
				System.out.println(d.getNombreProducto());

			}
		}
	}
}

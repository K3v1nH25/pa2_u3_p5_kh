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

		Factura fact = new Factura();
		fact.setFecha(LocalDateTime.now());
		fact.setNumero("001-025");
		fact.setCedula("1724693112");

		DetalleFactura deta = new DetalleFactura();
		deta.setCantidad(4);
		deta.setCodigoBarras("5255");
		deta.setFactura(fact);
		deta.setNombreProducto("CocaCola");

		DetalleFactura deta2 = new DetalleFactura();
		deta2.setCantidad(2);
		deta2.setCodigoBarras("1724");
		deta2.setFactura(fact);
		deta2.setNombreProducto("Vita Leche");

		List<DetalleFactura> detalle = new ArrayList<DetalleFactura>();
		detalle.add(deta);
		detalle.add(deta2);

		fact.setDetalleFactura(detalle);

		// this.iFacturaService.guardar(fact);
		Factura fact1 = this.iFacturaService.buscarPorNumero("001-025");
		for (DetalleFactura det : fact1.getDetalleFactura()) {
			System.out.println(det.getCodigoBarras());
		}
		System.out.println(fact1);
	}

}

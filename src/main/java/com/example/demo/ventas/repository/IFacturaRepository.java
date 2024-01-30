package com.example.demo.ventas.repository;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Factura;

public interface IFacturaRepository {

	public Factura seleccionarPorNumero(String numero);

	public void insertar(Factura factura);

	public List<Factura> seleccionarInnerJoin();

	public List<Factura> seleccionarFacturasRightJoin();

	public List<Factura> seleccionarFacturasLeftJoin();

	public List<Factura> seleccionarFacturasFullJoin();

	public List<Factura> seleccionarFacturasWhereJoin();

	public List<Factura> seleccionarFacturasFetchJoin();

}

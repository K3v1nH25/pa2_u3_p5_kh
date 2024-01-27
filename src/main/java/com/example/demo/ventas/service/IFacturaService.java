package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Factura;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);

	public void guardar(Factura factura);

	public List<Factura> buscarInnerJoin();

	public List<Factura> buscarFacturasRightJoin();

	public List<Factura> buscarFacturasLeftJoin();

	public List<Factura> buscarFacturasFullJoin();

}

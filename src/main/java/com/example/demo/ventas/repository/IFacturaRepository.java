package com.example.demo.ventas.repository;

import com.example.demo.ventas.repository.modelo.Factura;

public interface IFacturaRepository {

	public Factura seleccionarPorNumero(String numero);

	public void insertar(Factura factura);

}

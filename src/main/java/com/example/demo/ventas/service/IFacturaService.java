package com.example.demo.ventas.service;

import com.example.demo.ventas.repository.modelo.Factura;

public interface IFacturaService {
	
	public Factura buscarPorNumero(String numero);

	public void guardar(Factura factura);


}

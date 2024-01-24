package com.example.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repository.IFacturaRepository;
import com.example.demo.ventas.repository.modelo.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository iFacturaRepository;

	@Override
	public Factura buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarPorNumero(numero);
	}

	@Override
	public void guardar(Factura factura) {
		// TODO Auto-generated method stub
		this.iFacturaRepository.insertar(factura);

	}

}

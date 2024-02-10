package com.example.demo.ventas.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.ventas.repository.IFacturaRepository;
import com.example.demo.ventas.repository.modelo.Cliente;
import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository iFacturaRepository;

	@Autowired
	private IClienteService clienteService;

	@Override
	public Factura buscarPorNumero(String numero) {
		// TODO Auto-generated method stub

		return this.iFacturaRepository.seleccionarPorNumero(numero);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Factura factura, Cliente cliente) {
		// TODO Auto-generated method stub
		BigDecimal valor = new BigDecimal(100);
		valor = valor.multiply(new BigDecimal(0.12));
		factura.setValorIVA(valor);

		System.out.println(TransactionSynchronizationManager.isActualTransactionActive());
		this.iFacturaRepository.insertar(factura);
		System.out.println("paso el insert de factura");
		this.clienteService.guardar(cliente);
		System.out.println("Paso el insert de cliente");
	}

	@Override
	public List<Factura> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Factura> buscarFacturasRightJoin() {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarFacturasRightJoin();
	}

	@Override
	public List<Factura> buscarFacturasLeftJoin() {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarFacturasLeftJoin();
	}

	@Override
	public List<Factura> buscarFacturasFullJoin() {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarFacturasFullJoin();
	}

	@Override
	public List<Factura> buscarFacturasWhereJoin() {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarFacturasWhereJoin();
	}

	@Override
	public List<Factura> buscarFacturasFetchJoin() {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarFacturasFetchJoin();
	}

	@Override
	public int actualizarFechas(LocalDateTime fechaNueva, LocalDateTime fechaActual) {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.actualizarFechas(fechaNueva, fechaActual);
	}

	@Override
	public int borrarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.eliminarPorNumero(numero);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iFacturaRepository.eliminar(id);

	}

	@Override
	public List<FacturaDTO> buscarFcaturasDTO() {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.seleccionarFcaturasDTO();
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void prueba() {
		// TODO Auto-generated method stub
		System.out.println("Metodo de prueba");
		System.out.println("Main:" + TransactionSynchronizationManager.isActualTransactionActive());

	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public void factura() {
		// TODO Auto-generated method stub
		System.out.println("not suppoted");
		System.out.println("Main:" + TransactionSynchronizationManager.isActualTransactionActive());
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void pruebaSupport() {
		// TODO Auto-generated method stub
		System.out.println("Prueba Factura:" + TransactionSynchronizationManager.isActualTransactionActive());
		this.clienteService.pruebaSupports();
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void pruebaNever() {
		// TODO Auto-generated method stub
		System.out.println("Prueba Factura:" + TransactionSynchronizationManager.isActualTransactionActive());
		this.clienteService.pruebaNever();

	}

}

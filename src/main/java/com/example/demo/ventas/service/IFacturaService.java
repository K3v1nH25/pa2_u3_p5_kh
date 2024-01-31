package com.example.demo.ventas.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);

	public void guardar(Factura factura);

	public List<Factura> buscarInnerJoin();

	public List<Factura> buscarFacturasRightJoin();

	public List<Factura> buscarFacturasLeftJoin();

	public List<Factura> buscarFacturasFullJoin();

	public List<Factura> buscarFacturasWhereJoin();

	public List<Factura> buscarFacturasFetchJoin();

	public int actualizarFechas(LocalDateTime fechaNueva, LocalDateTime fechaActual);

	public int borrarPorNumero(String numero);

	public void borrar(Integer id);

	public List<FacturaDTO> buscarFcaturasDTO();
}

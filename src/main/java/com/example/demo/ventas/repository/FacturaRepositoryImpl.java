package com.example.demo.ventas.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepositoryImpl implements IFacturaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Factura seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("SELECT f FROM Factura f WHERE f.numero = :numero",
				Factura.class);
		myQuery.setParameter("numero", numero);
		Factura fact = myQuery.getSingleResult();
		fact.getDetalleFactura().size();
		return fact;
	}

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);

	}

	@Override
	public List<Factura> seleccionarInnerJoin() {
		// TODO Auto-generated method stub.
		// SQL: SELECT * FROM factura f inner join detalle_factura d on
		// f.fact_id=d.defa_id_factura
		// JPQL: SELECT f FROM Factura f INNER JOIN f.detalleFactura d
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f INNER JOIN f.detalleFactura d", Factura.class);
		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFactura().size();
		}
		return lista;
	}

	@Override
	public List<Factura> seleccionarFacturasRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f RIGHT JOIN f.detalleFactura d", Factura.class);
		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFactura().size();
		}
		return lista;

	}

	@Override
	public List<Factura> seleccionarFacturasLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f LEFT JOIN f.detalleFactura d", Factura.class);
		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFactura().size();
		}
		return lista;
	}

	@Override
	public List<Factura> seleccionarFacturasFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f FULL JOIN f.detalleFactura d", Factura.class);
		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFactura().size();
		}
		return lista;
	}
}

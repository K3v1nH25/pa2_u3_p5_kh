package com.example.demo.ventas.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

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
	@Transactional(value = TxType.MANDATORY)
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

	@Override
	public List<Factura> seleccionarFacturasWhereJoin() {
		// TODO Auto-generated method stub
		// SQL: SELECT f.* FROM factura f, detalle_factura d WHERE f.fact_id =
		// d.defa_id_factura
		// JPQL: SELECT f FROM Factura f, DetalleFactura d
		// WHERE f = d.factura
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f, DetalleFactura d WHERE f = d.factura", Factura.class);
		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFactura().size();
		}
		return myQuery.getResultList();
	}

	// Fetch es mas eficiente en terminos de numero de consultas
	// Native query es mucho mas rapido SQL puro (hibernate)
	@Override
	public List<Factura> seleccionarFacturasFetchJoin() {
		// TODO Auto-generated method stub
		// SELECT f FROM Factura f JOIN FETCH f.detalleFactura d
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f JOIN FETCH f.detalleFactura d", Factura.class);

		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(factura);

	}

	@Override
	public int actualizarFechas(LocalDateTime fechaNueva, LocalDateTime fechaActual) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createQuery("UPDATE Factura f SET f.fecha = :fechaNueva WHERE f.fecha >= :fechaActual");
		myQuery.setParameter("fechaNueva", fechaNueva);
		myQuery.setParameter("fechaActual", fechaActual);
		return myQuery.executeUpdate();
	}

	public Factura buscar(Integer id) {
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));

	}

	@Override
	public int eliminarPorNumero(String numero) {
		// TODO Auto-generated method stub
		// SQL: DELETE FROM factura WHERE fact_numero = :numero
		// JPQL: DELETE FROM Factura f WHERE f.numero = :numero
		Query myQuery = this.entityManager.createQuery("DELETE FROM Factura f WHERE f.numero = :numero");
		myQuery.setParameter("numero", numero);
		return myQuery.executeUpdate();

	}

	@Override
	public List<FacturaDTO> seleccionarFcaturasDTO() {
		// TODO Auto-generated method stub
		TypedQuery<FacturaDTO> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.ventas.repository.modelo.dto.FacturaDTO(f.numero,f.fecha) FROM Factura f",
				FacturaDTO.class);
		return myQuery.getResultList();
	}
}

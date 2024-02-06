package com.example.demo.ventas.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repository.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class ClienteRepositoryImpl implements IClienteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Antes de ejecutarse");
		try {
			this.entityManager.persist(cliente);
		}catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e.getClass());
		}
		
		System.out.println("Despues de ejecutarse");
	}

}

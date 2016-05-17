package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.bitbank.entidade.Conta;

public class ContaDao {

	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Conta conta) {
		manager.getTransaction().begin();
		
		manager.persist(conta);
		
		manager.getTransaction().commit();
	}

	public void altera(Conta conta) {
		manager.getTransaction().begin();
		
		manager.merge(conta);
		
		manager.getTransaction().commit();		
	}

	public void remove(Conta conta) {
		manager.getTransaction().begin();

		manager.remove(conta);
		
		manager.getTransaction().commit();

	}
	
	public List<Conta> todos() {
	  return manager.createQuery("from Conta", Conta.class).getResultList();
	}

	public List<Conta> ordenadosPorAgencia() {
		return manager.createQuery("select c from Conta c order by c.agencia", Conta.class).getResultList();
	}	
	
	public Conta porId(Long id) {
		return manager.find(Conta.class, id);
	}
}

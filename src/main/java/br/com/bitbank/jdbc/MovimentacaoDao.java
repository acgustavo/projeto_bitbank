package br.com.bitbank.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.bitbank.entidade.Movimentacao;

public class MovimentacaoDao {
	
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Movimentacao movimentacao) {
		manager.getTransaction().begin();
		
		manager.persist(movimentacao);
		
		manager.getTransaction().commit();
	}

	public void altera(Movimentacao movimentacao) {
		manager.getTransaction().begin();
		
		manager.merge(movimentacao);
		
		manager.getTransaction().commit();		
	}

	public void remove(Movimentacao movimentacao) {
		manager.getTransaction().begin();

		manager.remove(movimentacao);
		
		manager.getTransaction().commit();

	}
	
	public List<Movimentacao> todos() {
	  return manager.createQuery("from Movimentacao", Movimentacao.class).getResultList();
	}

	public List<Movimentacao> ordenadosPorAgencia() {
		return manager.createQuery("select c from Movimentacao m order by m.descricao", Movimentacao.class).getResultList();
	}	
	
	public Movimentacao porId(Long id) {
		return manager.find(Movimentacao.class, id);
	}
}

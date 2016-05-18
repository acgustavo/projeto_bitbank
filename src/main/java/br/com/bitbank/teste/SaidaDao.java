package br.com.bitbank.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.bitbank.entidade.Saida;
import br.com.bitbank.jdbc.JPAUtil;

public class SaidaDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Saida saida) {
		manager.getTransaction().begin();
		
		manager.persist(saida);
		
		manager.getTransaction().commit();
	}

	public void altera(Saida saida) {
		manager.getTransaction().begin();
		
		manager.merge(saida);
		
		manager.getTransaction().commit();		
	}

	public void remove(Saida saida) {
		manager.getTransaction().begin();

		manager.remove(saida);
		
		manager.getTransaction().commit();

	}
	
	public List<Saida> todos() {
	  return manager.createQuery("from Saida", Saida.class).getResultList();
	}

	public List<Saida> ordenadosPeloNome() {
		return manager.createQuery("select s from Saida s order by s.data_movimentacao", Saida.class).getResultList();
	}	
	
	public Saida porId(Long id) {
		return manager.find(Saida.class, id);
	}
}

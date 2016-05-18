package br.com.bitbank.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.bitbank.entidade.ContaCorrente;

public class ContaCorrenteDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(ContaCorrente contaCorrente) {
		manager.getTransaction().begin();

		manager.persist(contaCorrente);

		manager.getTransaction().commit();
	}

	public void altera(ContaCorrente contaCorrente) {
		manager.getTransaction().begin();

		manager.merge(contaCorrente);

		manager.getTransaction().commit();
	}

	public void remove(ContaCorrente contaCorrente) {
		manager.getTransaction().begin();

		manager.remove(contaCorrente);

		manager.getTransaction().commit();

	}

	public List<ContaCorrente> todos() {
		return manager.createQuery("from ContaCorrente", ContaCorrente.class).getResultList();
	}

	public List<ContaCorrente> ordenadosPeloNumeroConta() {
		return manager.createQuery("select c from ContaCorrente c order by c.n_conta", ContaCorrente.class).getResultList();
	}

	public ContaCorrente porId(Long id) {
		return manager.find(ContaCorrente.class, id);
	}
}

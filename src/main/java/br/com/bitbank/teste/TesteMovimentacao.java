package br.com.bitbank.teste;

import br.com.bitbank.entidade.Conta;
import br.com.bitbank.entidade.ContaCorrente;
import br.com.bitbank.jdbc.ContaCorrenteDao;
import br.com.bitbank.jdbc.ContaDao;

public class TesteMovimentacao {
	public static void main(String[] args) {
		
		ContaDao dao = new ContaDao();
		Long x =(long) 1;
		System.out.println(x);
		Conta conta = dao.porId(x);
		System.out.println(conta);
		
		
//		Movimentacao receptor = new Movimentacao(TipoMovimentacao.transferencia, "transferencia", new BigDecimal("40.00"), conta1);
//		Movimentacao emissor = new Movimentacao(TipoMovimentacao.transferencia, "transferencia", new BigDecimal("40.00"), conta2);
//		conta1.getMovimentacoes().add(emissor);
//		conta2.getMovimentacoes().add(receptor);
//		conta1.setValor(conta1.getValor().add(new BigDecimal("40.00")));
//		conta2.setValor(conta2.getValor().subtract(new BigDecimal("40.00")));
//		dao1.adiciona(conta1);
//		dao2.adiciona(conta2);
	}
}

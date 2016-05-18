package br.com.bitbank.teste;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import br.com.bitbank.entidade.Cliente;
import br.com.bitbank.entidade.ContaCorrente;
import br.com.bitbank.entidade.Saida;
import br.com.bitbank.jdbc.ClienteDao;

public class Teste {

	public static void main(String[] args) {
		Cliente gu = new Cliente("Gustavo", "g@G.com", "Rua...", new GregorianCalendar(1995, 07, 16), "000.000.000-00");

		ContaCorrente conta = new ContaCorrente("0518", "000000222", new BigDecimal("50.00"), gu);
		gu.getContas().add(conta);

		Saida pagamento = new Saida("pagamento", conta, new BigDecimal("40.00"));
		conta.getMovimentacoes().add(pagamento);

			System.out.println(gu);
			ClienteDao dao = new ClienteDao();
			dao.adiciona(gu);
			System.out.println(conta);
			System.out.println(pagamento);
	}
}
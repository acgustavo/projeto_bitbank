package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "entrada")
public class Saida extends Movimentacao {
	private BigDecimal saidaValor;

	@Override
	public BigDecimal saidaValor() {
		return super.getConta().getValor().subtract(saidaValor);
	}

	@Override
	public BigDecimal entradaValor() {
		return null;
	}
}

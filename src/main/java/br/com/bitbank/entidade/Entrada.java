package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "entrada")
public class Entrada extends Movimentacao {
	private BigDecimal entradaValor;

	@Override
	public BigDecimal entradaValor() {
		return super.getConta().getValor().add(entradaValor);
	}

	@Override
	public BigDecimal saidaValor() {
		return null;
	}

}

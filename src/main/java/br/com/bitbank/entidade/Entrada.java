package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "entrada")
public class Entrada extends Movimentacao {
	
	@Column(name = "entrada_valor")
	private BigDecimal entradaValor;
	
	public Entrada(String destricao, Conta conta) {
		super.setDestricao(destricao);
		super.setConta(conta);
	}

	@Override
	public BigDecimal NValor() {
		return super.getConta().getValor().add(entradaValor);
	}

}

package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "entrada")
public class Saida extends Movimentacao {
	
	@Column(name = "saida_valor")
	private BigDecimal saidaValor;

	
	public Saida(String destricao, ContaPoupanca conta,BigDecimal saidaValor) {
		super.setDestricao(destricao);
		super.setConta(conta);
		this.saidaValor = saidaValor;
	}
	
	public Saida(String destricao, ContaCorrente conta,BigDecimal saidaValor) {
		super.setDestricao(destricao);
		super.setConta(conta);
		this.saidaValor = saidaValor;
	}
	
	
	public BigDecimal getSaidaValor() {
		return saidaValor;
	}


	public void setSaidaValor(BigDecimal saidaValor) {
		this.saidaValor = saidaValor;
	}
	
	@Override
	public BigDecimal NValor() {
		return super.getConta().getValor().subtract(saidaValor);
	}
}

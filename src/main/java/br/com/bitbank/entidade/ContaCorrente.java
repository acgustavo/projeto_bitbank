package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contas_corrente")
public class ContaCorrente extends Conta  {

	private BigDecimal limite;
	
	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	@Override
	public BigDecimal limite(){ 
		return getValor().add(limite);
	}

	@Override
	public BigDecimal rendimento() {
		return null;
	}
}

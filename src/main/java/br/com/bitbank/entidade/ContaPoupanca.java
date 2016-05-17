package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contas_poupanca")
public class ContaPoupanca extends Conta {

	@Override
	public BigDecimal rendimento(){ 
		return getValor().multiply(new BigDecimal("1.05"));
	}

	@Override
	public BigDecimal limite() {
		return null;
	}
	
}
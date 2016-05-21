package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contas_corrente")
@PrimaryKeyJoinColumn(name = "conta_id")
public class ContaCorrente extends Conta {
	
	private BigDecimal limite= new BigDecimal("300.00");

	
	
	public BigDecimal getLimite() {
		return limite;
	}


	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
}

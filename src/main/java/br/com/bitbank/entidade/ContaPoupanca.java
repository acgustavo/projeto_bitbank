package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "conta_id")
@Table(name = "contas_poupanca")
public class ContaPoupanca extends Conta {
	
	private BigDecimal rendimento;

	public BigDecimal getLimite() {
		return rendimento;
	}

	public void setLimite(BigDecimal rendimento) {
		this.rendimento = rendimento;
	}
}
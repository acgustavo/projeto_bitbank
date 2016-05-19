package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contas_poupanca")
public class ContaPoupanca extends Conta {
	
	private BigDecimal rendimento;
	
	public ContaPoupanca( String agencia, String nConta, BigDecimal valor, Cliente cliente) {
		super.setAgencia(agencia);
		super.setnConta(nConta);
		super.setValor(valor);
		super.setCliente(cliente);
	}

	public BigDecimal getLimite() {
		return rendimento;
	}

	public void setLimite(BigDecimal rendimento) {
		this.rendimento = rendimento;
	}
}
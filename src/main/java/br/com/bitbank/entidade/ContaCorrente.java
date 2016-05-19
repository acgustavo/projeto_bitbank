package br.com.bitbank.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contas_corrente")
public class ContaCorrente extends Conta {
	
	private BigDecimal limite= new BigDecimal("300.00");

	public ContaCorrente( String agencia, String nConta, BigDecimal valor, Cliente cliente) {
			super.setAgencia(agencia);
			super.setnConta(nConta);
			super.setValor(valor);
			super.setCliente(cliente);
		}
	
	
	public BigDecimal getLimite() {
		return limite;
	}


	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
}

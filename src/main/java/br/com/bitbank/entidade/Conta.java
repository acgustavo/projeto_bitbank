package br.com.bitbank.entidade;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "contas")
public abstract class Conta {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String agencia;
	@Column(nullable = false, unique = true, name = "n_conta")
	private String nConta;
	@Column(nullable = false)
	private BigDecimal valor;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_abertura")
	private Calendar dataAbertura = Calendar.getInstance();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getnConta() {
		return nConta;
	}

	public void setnConta(String nConta) {
		this.nConta = nConta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public abstract BigDecimal rendimento();
	
	public abstract BigDecimal limite();
}

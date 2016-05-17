package br.com.bitbank.entidade;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "movimentacoes")
public abstract class Movimentacao {

	@Id
	@GeneratedValue
	private Long id;
	
	// private TipoConta tipoConta;
	@Column(nullable = false)
	private String destricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_movimentacao")
	private Calendar dataMovimentacao = Calendar.getInstance();
	
	@ManyToOne
	@JoinColumn(name = "conta_id", nullable = false)
	private Conta conta;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestricao() {
		return destricao;
	}

	public void setDestricao(String destricao) {
		this.destricao = destricao;
	}

	public Calendar getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Calendar dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public  abstract BigDecimal entradaValor();
	
	public  abstract BigDecimal saidaValor();

}

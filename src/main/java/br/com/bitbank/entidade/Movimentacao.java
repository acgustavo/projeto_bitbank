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
public class Movimentacao {

	@Id
	@GeneratedValue
	private Long id;
	
	private TipoMovimentacao tipoMovimentacao;
	
	@Column(nullable = false)
	private String destricao;
	
	private  BigDecimal valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_movimentacao",nullable = false)
	private Calendar dataMovimentacao = Calendar.getInstance();
	
	@ManyToOne
	@JoinColumn(name = "conta_id", nullable = false)
	private Conta conta;
	
	public Movimentacao( TipoMovimentacao tipoMovimentacao, String destricao, BigDecimal valor, Conta conta) {
		super();
		this.tipoMovimentacao = tipoMovimentacao;
		this.destricao = destricao;
		this.valor = valor;
		this.conta = conta;
	}

	public Long getId() {
		return id;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
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
}

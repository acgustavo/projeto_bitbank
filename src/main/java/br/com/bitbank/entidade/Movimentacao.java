package br.com.bitbank.entidade;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_movimentacao", nullable = false)
	private TipoMovimentacao tipoMovimentacao;
	
	@Column(nullable = false)
	private String historico;
	
	@Column(nullable = false)
	private  BigDecimal valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_movimentacao",nullable = false)
	private Calendar dataMovimentacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_lancamento", nullable = false)
	private TipoLancamento tipoLancamento;
	
	@ManyToOne
	@JoinColumn(name = "conta_id", nullable = false)
	private Conta conta;
	
	
	

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
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

	public String getHistorico() {
		return historico;
	}
	
	public void setHistorico(String historico) {
		this.historico = historico;
	}

	
	public Calendar getDataMovimentacao() {
		return dataMovimentacao;
	}

	public Date getDateDataMovimentacao() {
		return dataMovimentacao.getTime();
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
	@Override
	public String toString() {
		return historico + " - " + tipoLancamento.getDescricao() + " de " + valor + "\n";
	}
}

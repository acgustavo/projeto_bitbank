package br.com.bitbank.entidade;

public enum TipoMovimentacao{
	TRANSFERENCIA("Transferência"), PAGAMENTO("Pagamento"), RECARGA("Recarga");
	
	private String descricao;

    TipoMovimentacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

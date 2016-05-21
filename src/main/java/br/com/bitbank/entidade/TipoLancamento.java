package br.com.bitbank.entidade;

public enum TipoLancamento {
    D("Débito"), C("Crédito");
    
    private String descricao;

    TipoLancamento(String descricao) {
        this.descricao = descricao;
    }

	public String getDescricao() {
        return descricao ;
    }
}

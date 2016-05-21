package br.com.bitbank.entidade;

public enum TipoLancamento {
    D("D�bito"), C("Cr�dito");
    
    private String descricao;

    TipoLancamento(String descricao) {
        this.descricao = descricao;
    }

	public String getDescricao() {
        return descricao ;
    }
}

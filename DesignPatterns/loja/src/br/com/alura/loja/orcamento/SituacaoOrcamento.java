package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("O orçamento não pode ser aprovado!");
	};
	

	public void reprovar(Orcamento orcamento) {
		throw new DomainException("O orçamento não pode ser reprovado!");
	};
	

	public void finalizar(Orcamento orcamento) {
		throw new DomainException("O orçamento não pode ser finalizado!");
	};
	
}

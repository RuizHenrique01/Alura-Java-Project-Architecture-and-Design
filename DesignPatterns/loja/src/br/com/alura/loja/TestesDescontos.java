package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
		Orcamento terceiroOrcamento = new Orcamento(new BigDecimal("400"), 1);
		
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		System.out.println(calculadoraDeDescontos.calcular(primeiroOrcamento));
		System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));
		System.out.println(calculadoraDeDescontos.calcular(terceiroOrcamento));
	}
}

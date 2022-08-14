package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, Boolean meta) {
		Cargo cargoAtual = funcionario.getCargo();
		
		if(cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException("Gerente não pode ser promovido!");
		}
		
		if(!meta) {
			throw new ValidacaoException("Meta não foi atingida!");
		}
		
		Cargo novoCargo = cargoAtual.getProximoCargo();
		funcionario.promover(novoCargo);
	}
}

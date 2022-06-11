package br.edu.infnet.apigrl.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.apigrl.model.domain.Estabelecimento;
import br.edu.infnet.apigrl.model.repository.EstabelecimentoRepository;

public class EstabelecimentoService {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoRepository.save(estabelecimento);
	}

}

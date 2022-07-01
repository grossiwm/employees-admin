package br.edu.infnet.estabelecimentoapi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.estabelecimentoapi.model.domain.Estabelecimento;
import br.edu.infnet.estabelecimentoapi.model.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoRepository.save(estabelecimento);
	}
	
	public List<Estabelecimento> buscarTodos() {
		return (List<Estabelecimento>) estabelecimentoRepository.findAll();
	}

}

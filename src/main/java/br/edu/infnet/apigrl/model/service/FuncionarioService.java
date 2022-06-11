package br.edu.infnet.apigrl.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apigrl.model.domain.Funcionario;
import br.edu.infnet.apigrl.model.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public List<Funcionario> obterLista(Integer estabelecimentoId) {
		return funcionarioRepository.obterLista(estabelecimentoId);
	}
	
	public void incluir(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

}

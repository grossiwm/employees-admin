package br.edu.infnet.estabelecimentoapi.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.estabelecimentoapi.model.domain.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

	@Query("from Funcionario f where f.estabelecimento.id = :idEstabelecimento")
	List<Funcionario> obterLista(Integer idEstabelecimento);
}

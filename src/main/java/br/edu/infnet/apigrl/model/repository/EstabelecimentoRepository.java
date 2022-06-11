package br.edu.infnet.apigrl.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apigrl.model.domain.Estabelecimento;
import br.edu.infnet.apigrl.model.domain.Usuario;

@Repository
public interface EstabelecimentoRepository extends CrudRepository<Estabelecimento, Integer> {
}

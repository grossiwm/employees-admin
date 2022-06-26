package br.edu.infnet.estabelecimentoapi.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.estabelecimentoapi.model.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	@Query("from Usuario u where u.login = :login and u.senha = :senha")
	Usuario validar(String login, String senha);
}

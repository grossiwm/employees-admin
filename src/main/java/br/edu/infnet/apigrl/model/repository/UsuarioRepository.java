package br.edu.infnet.apigrl.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.apigrl.model.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	@Query("from Usuario u where u.login = :login and u.senha = :senha")
	Usuario validar(String login, String senha);
}

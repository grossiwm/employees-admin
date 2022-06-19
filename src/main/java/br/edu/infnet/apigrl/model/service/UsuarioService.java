package br.edu.infnet.apigrl.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apigrl.model.domain.Usuario;
import br.edu.infnet.apigrl.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validar(String login, String senha) {
		return usuarioRepository.validar(login, senha);
	}
	
	public void excluir(Integer id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
	
	public List<Usuario> obterLista() {
		return (List<Usuario>) usuarioRepository.findAll();
	}
}

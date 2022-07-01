package br.edu.infnet.estabelecimentoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.estabelecimentoapi.model.domain.Estabelecimento;
import br.edu.infnet.estabelecimentoapi.model.service.EstabelecimentoService;

@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {
	
	@Autowired
	private EstabelecimentoService estabelecimentoService;

	@PostMapping
	public void incluir(@RequestBody Estabelecimento estabelecimento) {
		estabelecimentoService.incluir(estabelecimento);
	}
	
	@GetMapping
	public List<Estabelecimento> listar() {
		return estabelecimentoService.buscarTodos();
	}

}

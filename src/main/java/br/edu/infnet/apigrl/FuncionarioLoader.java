package br.edu.infnet.apigrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apigrl.model.domain.Estabelecimento;
import br.edu.infnet.apigrl.model.domain.Funcionario;
import br.edu.infnet.apigrl.model.service.FuncionarioService;
import br.edu.infnet.apigrl.model.service.UsuarioService;

@Component
@Order(2)
public class FuncionarioLoader implements ApplicationRunner {
	@Autowired
	private FuncionarioService funcionarioService;
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String[] cpfs = {"12345678901", "23456789012", "12345678901", "34567890123"};
		
		Funcionario funcionario = null;

		Estabelecimento estabelecimento = (Estabelecimento)usuarioService.validar("infnet", "123");
		
		for(String cpf : cpfs) {				
			funcionario = new Funcionario();
			funcionario.setCpf(cpf);
			funcionario.setEmail(cpf+"@professor.com");
			funcionario.setEstabelecimento(estabelecimento);
			funcionario.setLogin("infnet"+cpf);
			funcionario.setNome("Instituto Infnet "+cpf);
			funcionario.setSenha("x"+cpf);		
			funcionario.setTelefone("(21) 99601-6255");
			
			try {
				funcionarioService.incluir(funcionario);			
				System.out.println("Processo de inclusão de funcionário.");			
			} catch (Exception e) {
				System.out.println("["+e.getMessage()+"]");
				System.out.println("[ERRO] Impossível realizar a inclusão do funcionario " + funcionario.getNome());			
			}
		}	
	}
}

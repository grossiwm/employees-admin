package br.edu.infnet.apigrl.model.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ch.qos.logback.classic.db.names.ColumnName;

@Entity
@Table(
		name = "TUsuario",
				uniqueConstraints = @UniqueConstraint(columnNames={"login", "senha"})
)
public class Usuario {
	
	@Id
	private Integer id;
	private String nome;
	private String login;
	private String senha;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}

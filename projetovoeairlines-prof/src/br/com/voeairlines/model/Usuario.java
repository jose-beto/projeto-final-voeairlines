package br.com.voeairlines.model;

import br.com.voeairlines.dao.UsuarioDAO;

public class Usuario {

	private Integer id;
	private String senha;
	private String usuario;

	public Usuario(Integer id) {

		this.id = id;
	}

	public Usuario(String usuario, String senha) {

		this.usuario = usuario;
		this.senha = senha;

	}

	public Usuario(Integer id, String usuario, String senha) {

		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void validarUsuario(Usuario usuario) {

		new UsuarioDAO().validarUsuario(usuario);

	}

	public void inserirUsuario(Usuario usuario) {

		new UsuarioDAO().inserirUsuario(usuario);
	}

	public void atualizarUsuario(Usuario usuario) {

		new UsuarioDAO().atualizarUsuario(usuario);

	}

	public void deletarUsuario(Usuario usuario) {

		new UsuarioDAO().deletarUsuario(usuario);

	}

	public void selecionarUsuario(Usuario usuario) {

		new UsuarioDAO().selecionarUsuario(usuario);

	}

}

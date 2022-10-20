package br.com.voeairlines.controller;

import br.com.voeairlines.model.Usuario;

public class UsuarioController {
	
	public boolean validarUsuario(String usuario, String senha) {
		
		
		Usuario  user = new  Usuario(usuario, senha);
		
		user.validarUsuario(user);
		
		return true;
		
	}
  
public boolean inserirUsuario(String usuario, String senha) {
		
		
		Usuario  user = new  Usuario(usuario, senha);
		
		user.inserirUsuario(user);
		
		return true;
		
	}
	
}

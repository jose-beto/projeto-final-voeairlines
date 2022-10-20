package br.com.voeairlines.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.voeairlines.model.Usuario;
import br.com.voeairlines.view.CadastroAeronave;
import br.com.voeairlines.view.CadastroUsuario;

public class UsuarioDAO {

	public void validarUsuario(Usuario usuario) {

		String sql = "SELECT * FROM usuario where login = ? and senha = ?";

		Connection con = new Conexao().conexao();

		try {
			PreparedStatement stm = con.prepareStatement(sql);

			stm.setString(1, usuario.getUsuario());
			stm.setString(2, usuario.getSenha());
			ResultSet rs = stm.executeQuery();

			if (rs.next()) {
				
				CadastroUsuario exibir = new CadastroUsuario();

				JOptionPane.showMessageDialog(null, "Acesso realizado");
				
				exibir.setVisible(true);
				

			} else {

				JOptionPane.showMessageDialog(null, "Acesso invalido");

			}
			
			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	
		
	}

	public void inserirUsuario(Usuario usuario) {
		
		String sql = "INSERT INTO USUARIO (login, senha)VALUES(?, ?)";
		
		Connection con = new Conexao().conexao(); 
		try {
			
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, usuario.getUsuario());
			stm.setString(2, usuario.getSenha());
			
			stm.execute();
			
			JOptionPane.showMessageDialog(null, "Usuario foi cadastrado");
			
			stm.close();
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void atualizarUsuario(Usuario usuario) {
		
				
	}
	
	public void deletarUsuario(Usuario usuario) {
		
	}
	
	public void selecionarUsuario(Usuario usuario) {
}
	
}
